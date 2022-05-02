package SERVICASA;


public class Geriatria extends Servicio {
	private int anosExperiencia;
	private String titulacion;

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public Geriatria(String nombre, float precioBase, int anosExperiencia, String titulacion) {
		super(nombre, precioBase);
		this.anosExperiencia = anosExperiencia;
		this.titulacion = titulacion;
	}

}
