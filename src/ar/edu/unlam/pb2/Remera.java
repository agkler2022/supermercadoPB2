package ar.edu.unlam.pb2;

public class Remera extends Producto implements Indumentaria {

	private String talle;
	private String color;

	public Remera(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle = talle;
		this.color = color;
	}

	@Override
	public Object getTalle() {
		// TODO Auto-generated method stub
		return talle;
	}

	public String getColor() {
		return color;
	}

}
