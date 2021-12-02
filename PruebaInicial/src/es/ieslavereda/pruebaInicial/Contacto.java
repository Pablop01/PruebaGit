package es.ieslavereda.pruebaInicial;

public abstract class Contacto {

	private String nombre;
	private String telf;
	protected String tipo;
	
	
	public Contacto(String nombre, String telf) {
		super();
		this.nombre = nombre;
		this.telf = telf;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelf() {
		return telf;
	}


	public void setTelf(String telf) {
		this.telf = telf;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telf=" + telf + "]";
	}
	
}
