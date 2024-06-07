package main;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = 0, pessoasMenores21 = 0, pessoasMaiores50 = 0;
		
		
		while (idade >= 0 ) {
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
			
			if (idade < 21 && idade > 0) {
				pessoasMenores21++;
			} else if (idade > 50) {
				pessoasMaiores50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + pessoasMenores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaiores50);

		sc.close();
	}

}
