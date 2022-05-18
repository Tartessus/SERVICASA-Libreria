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

	public JardineriaImp(String nombre, float precioBase, boolean materialPropio) {
		super(nombre, precioBase);
		this.materialPropio = materialPropio;
	}

	@Override
	public String toString() {
		return getNombre() + "JardineriaImp [materialPropio=" + materialPropio + "]";
	}

	
}
