package aula_2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("São Quantos alunos?");
		int alunos = input.nextInt();
		double notas = 0.0;

		
		for( int x = 0; x< alunos; x++) {
			System.out.println("qual é a nota do aluno: ");
			notas += input.nextDouble();
		}
		double media = notas/alunos;
		System.out.println(alunos);
		System.out.println(media);
		System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
	}

}
