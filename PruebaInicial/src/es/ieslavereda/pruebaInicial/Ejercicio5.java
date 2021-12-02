package es.ieslavereda.pruebaInicial;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = 10;
		int numero;
		int positivos = 0;
		int negativos = 0;
		int cPositivos = 0;
		int cNegativos = 0;
		int mPositivos = 0;
		int mNegativos = 0;
		
		for(int i = 0; i < total; i++) {
			System.out.println("Introduce el numero " + (i+1));
			numero = sc.nextInt();
			if(numero < 0) {
				cNegativos++;
				negativos += numero;
			}else if(numero > 0) {
				cPositivos++;
				positivos += numero;
			}
		}
		
		mPositivos = positivos/cPositivos;
		mNegativos = negativos/cNegativos;
		
		System.out.println("La media de los numeros positivos es = " +  mPositivos);
		System.out.println("La media de los numeros negativos es = " +  mNegativos);

	}

}
