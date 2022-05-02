package SERVICASA;

public class Jardineria extends Servicio {
	private boolean materialPropio;

	public boolean isMaterialPropio() {
		return materialPropio;
	}

	public void setMaterialPropio(boolean materialPropio) {
		this.materialPropio = materialPropio;
	}

	public Jardineria(String nombre, float precioBase, boolean materialPropio) {
		super(nombre, precioBase);
		this.materialPropio = materialPropio;
	}

}
