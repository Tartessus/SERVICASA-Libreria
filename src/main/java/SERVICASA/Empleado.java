package SERVICASA;

import java.util.ArrayList;
import java.util.Collection;

public class Empleado {

	private int dni;
	private String nombre;
	private String apellido;
	private String direccion;
	private String email;
	private String ciudad;
	private String provincia;
	private Collection<Servicio> servicios = new ArrayList<>();

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
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Collection<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(Collection<Servicio> servicios) {
		this.servicios = servicios;
	}

	public void addServicio(Servicio servicio) {
		getServicios().add(servicio);
	}

	public Empleado() {

	}

	public Empleado(int dni, String nombre, String apellido, String direccion, String email, String ciudad, String provincia, Collection<Servicio> servicios ) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.email = email;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.servicios =servicios;

	}

	@Override
	public String toString() {
		return "Usuario: " + getNombre() + " con DNI: " + getDni();
	}

	
}
