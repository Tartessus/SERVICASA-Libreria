package SERVICASA;



public class Empleado {

	private String nombre;

	private String ciudad;
	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setEmpleado(String nombre) {
		this.nombre = nombre;
	}

	

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Empleado() {

	}

	public Empleado(String nombre,  String ciudad, String email) {
		super();
		this.nombre = nombre;

		this.ciudad = ciudad;
		this.email = email;

	}

}
