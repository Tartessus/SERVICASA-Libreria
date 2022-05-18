package SERVICASA;

public class Empleado {
	
	private int dni;
	private String nombre;
	private String ciudad;
	private String email;

	
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
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

	public Empleado(int dni, String nombre, String ciudad, String email) {
		this.dni =dni;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.email = email;

	}

	@Override
	public String toString() {
		return "Usuario: " + getNombre() + " con DNI: "+ getDni();
	}


}
