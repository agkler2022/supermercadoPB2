package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	private Integer pulgadas;
	private Integer garantia;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia, String marca,
			Double precio) {
		super(codigo, descripcion, marca, precio);
		this.pulgadas = pulgadas;
		this.garantia = garantia;
	}

	public Object getPulgadas() {
		// TODO Auto-generated method stub
		return pulgadas;
	}

	@Override
	public Object getGarantia() {
		// TODO Auto-generated method stub
		return garantia;
	}

}
