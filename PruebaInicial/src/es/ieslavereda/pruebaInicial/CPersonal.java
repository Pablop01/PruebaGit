package es.ieslavereda.pruebaInicial;

public class CPersonal extends Contacto{

	private String fechaNacimiento2;
	
	public CPersonal(String nombre, String telf) {
		super(nombre, telf);
		// TODO Auto-generated constructor stub
	}

	public CPersonal(String nombre, String telf, String fechaNacimiento) {
		super(nombre, telf);
		this.fechaNacimiento = fechaNacimiento;
		this.tipo = "PERSONAL";
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
		return "CPersonal [fechaNacimiento=" + fechaNacimiento + ", tipo=" + tipo + "]";
	}
	
}
