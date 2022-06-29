package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private ArrayList<Producto> carritoDeVentas;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		carritoDeVentas = new ArrayList<Producto>();
	}
	public void agregarProducto(Producto nuevo) {
		carritoDeVentas.add(nuevo);
	}

	public Double getImporte() {
		Double importeTotal = 0.0;
		for (Producto producto : carritoDeVentas) {
			importeTotal += producto.getPrecio();
		}
		return importeTotal;
	}

}
