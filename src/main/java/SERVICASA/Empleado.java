package SERVICASA;

import java.util.List;

public class Empleado {
	private Long id;
	private String empleado;
	private List<Servicio> servicios;
	private String ciudad;
	private String email;

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public List<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
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

	public Empleado(String empleado, List<Servicio> servicios, String ciudad, String email) {
		super();
		this.empleado = empleado;
		this.servicios = servicios;
		this.ciudad = ciudad;
		this.email = email;
	}

	
}
