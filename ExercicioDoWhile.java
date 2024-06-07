package main;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, somaPositivo = 0;
		
		do {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			
			if(numero > 0) {
				somaPositivo += numero;
			}
		}
		while(numero !=0);
		
		System.out.println("A soma dos numeros positivos e: " + somaPositivo);
				
		sc.close();
		
	}

}
