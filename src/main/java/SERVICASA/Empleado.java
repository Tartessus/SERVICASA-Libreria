package SERVICASA;



public class Empleado {

	private String empleado;

	private String ciudad;
	private String email;

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
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

	public Empleado(String empleado,  String ciudad, String email) {
		super();
		this.empleado = empleado;

		this.ciudad = ciudad;
		this.email = email;

	}

}
