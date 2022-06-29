package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String fechaElab;
	private String fechaVenc;
	private Double kilos;

	public Carne(Integer codigo, String descripcion, String fechaElab, String fechaVenc, Double kilos, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElab = fechaElab;
		this.fechaVenc = fechaVenc;
		this.kilos = kilos;
	}

	@Override
	public Object getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return fechaElab;
	}

	@Override
	public Object getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return fechaVenc;
	}

	public Double getKilos() {
		// TODO Auto-generated method stub
		return kilos;
	}

}
