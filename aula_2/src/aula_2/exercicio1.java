package aula_2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("São Quantos alunos?");
		int alunos = input.nextInt();
		double notas = 0.0;
		int x = 0;
		
		while (x < alunos) {
			System.out.println("qual é a nota do aluno: ");
			notas += input.nextDouble();
			++x;
		}
		double media = notas/x;
		System.out.println(x);
		System.out.println(media);
		System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
	}
	
}
