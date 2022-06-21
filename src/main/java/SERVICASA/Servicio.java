package SERVICASA;

public abstract class Servicio {
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String nombre;
	private float precioBase;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	public Servicio() {

	}

	public Servicio(String nombre, float precioBase) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;

	}



}
