package es.ieslavereda.pruebaInicial;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		

		HashMap <String,Integer> empleados = new HashMap <String,Integer>();
		
		Scanner sc = new Scanner(System.in);
		int total = 20;
		String empleado;
		int sueldoMax = 0;
		String nombre = "";
		
		for(int i = 0; i < total; i++) {
			
			int sueldo = 0;
			System.out.println("Introduce el nombre del empleado " + (i+1));
			nombre = sc.next();
			System.out.println("Introduce su sueldo");
			sueldo = sc.nextInt();
			
			empleados.put(nombre, sueldo);
			
			if(sueldo > sueldoMax) {
				sueldoMax = sueldo;
				empleado = nombre;
			}
			
			
		}
		
		System.out.println(nombre+" es el empleado con mayor sueldo ("+sueldoMax+"€)");

	}

}
