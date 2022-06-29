package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {

	private Integer talle;
	private String color;

	public Zapatilla(Integer codigo, String descripcion, Integer talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle=talle;
		this.color=color;
		
	}

	@Override
	public Object getTalle() {
		// TODO Auto-generated method stub
		return talle;
	}

	@Override
	public Object getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}
