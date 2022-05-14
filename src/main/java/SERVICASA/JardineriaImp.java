package SERVICASA;

public class JardineriaImp extends Servicio  {
	private boolean materialPropio;

	public boolean isMaterialPropio() {
		return materialPropio;
	}

	public void setMaterialPropio(boolean materialPropio) {
		this.materialPropio = materialPropio;
	}

	public JardineriaImp() {

	}

	public JardineriaImp(String nombre, float precioBase, boolean materialPropio, long id) {
		super(nombre, precioBase, id);
		this.materialPropio = materialPropio;
	}

}
