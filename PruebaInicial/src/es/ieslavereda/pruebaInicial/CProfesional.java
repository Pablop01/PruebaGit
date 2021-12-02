package es.ieslavereda.pruebaInicial;

public class CProfesional extends Contacto{

	private String correo;
	private String depart;
	
	public CProfesional(String nombre, String telf) {
		super(nombre, telf);
		// TODO Auto-generated constructor stub
	}

	public CProfesional(String nombre, String telf, String correo, String depart) {
		super(nombre, telf);
		this.correo = correo;
		this.depart = depart;
		this.tipo = "PROFESIONAL";
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return super.getNombre();
	}
	
	public String getTelf() {
		return super.getTelf();
	}
	
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}
	
	public void setTelf(String telf) {
		super.setTelf(telf);
	}

	@Override
	public String toString() {
		return "CProfesional [correo=" + correo + ", depart=" + depart + ", tipo=" + tipo + "]";
	}

}
