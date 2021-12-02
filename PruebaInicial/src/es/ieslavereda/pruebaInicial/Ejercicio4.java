package es.ieslavereda.pruebaInicial;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int n;
		int m = 1;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			total += calcularFactorial(i);
		}
		
		System.out.println("Total: " + total);
		
	}
	
	public static int calcularFactorial(int n) {
		
		int num = 1;
		
		for(int i = 1; i <= n; i++) {
			num *= i;
		}
		
		return num;
	}

}
