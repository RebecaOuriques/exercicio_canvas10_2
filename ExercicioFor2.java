package main;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero,contador, pares = 0, impares = 0;
		
		System.out.println("Informe 10 numero!");
		System.out.println();
		for(contador = 1; contador <= 10; contador++) {
			
			System.out.print("Digite o " + contador + " numero: ");
			numero = sc.nextInt();
			
			if (numero % 2 ==0) {
				pares++;
			} else {
				impares++;
			}
		}
		
		System.out.println("Total de numeros pares: " + pares);
		System.out.println("Total de numeros pares: " + impares);

		sc.close();
	}

}
