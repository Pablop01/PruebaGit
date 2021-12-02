package es.ieslavereda.pruebaInicial;

import java.util.ArrayList;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		ArrayList<Contacto> agenda = new ArrayList<Contacto>();
		
		agenda.add(new CPersonal("Pablo", "1111"));
		agenda.add(new CPersonal("Dani", "2222"));
		agenda.add(new CPersonal("Mario", "3333"));
		agenda.add(new CPersonal("Raul", "4444"));
		
		agenda.add(new CProfesional("Olbap", "5555"));
		agenda.add(new CProfesional("Inad", "6666"));
		agenda.add(new CProfesional("Oiram", "7777"));
		agenda.add(new CProfesional("Luar", "8888"));
		
	}

	public static void mostrarMenu() {
		
		System.out.println("1. Agregar Contacto");
		System.out.println("2. Eliminar Contacto");
		System.out.println("3. Buscar Contacto");
		System.out.println("4. Salir");
		
	}
	
}
