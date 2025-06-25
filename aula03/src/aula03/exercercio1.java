package aula03;

import java.util.Arrays;
import java.util.Scanner;

public class exercercio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] notas = new double[5];
		double somenotas = 0;
		for (int x = 0; x < notas.length; x++) {
			System.out.printf("escreva a %dª nota: ", x+1);
			notas[x] = input.nextDouble();
		}
		System.out.println(Arrays.toString(notas));
		for (double n: notas) {
			somenotas += n;
		}
		double media = somenotas / notas.length;
		System.out.println(media);
	}

}
