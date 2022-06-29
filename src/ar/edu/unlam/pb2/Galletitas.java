package ar.edu.unlam.pb2;

public class Galletitas extends Producto implements Comestible {

	private String fechaElab;
	private String fechaVenc;

	public Galletitas(Integer codigo, String descripcion, String fechaElab, String fechaVenc, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElab=fechaElab;
		this.fechaVenc=fechaVenc;
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

}
