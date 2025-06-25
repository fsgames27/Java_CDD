package aula_2;

import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int A[] = new int[4];
		int B[] = new int[4];
		int C[] = new int[4];
		int D[] = new int[4];
		
		for (int i = 0; i < A.length; i++) {
			System.out.printf("Digite o item %d de A,",i);
			A[i]=sc.nextInt();
			System.out.printf("Digite o item %d de B,",i);
			B[i]=sc.nextInt();
			System.out.printf("Digite o item %d de C,",i);
			C[i]=sc.nextInt();
			System.out.printf("Digite o item %d de D,",i);
			D[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		System.out.println(Arrays.toString(C));
		System.out.println(Arrays.toString(D));
		
		

	}

}
