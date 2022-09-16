package com.condicionais.exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Informa o valor de A e B ");
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A ==B) {
			int C = A+B;
			System.out.println(" A + B = C , portanto C vale " + C);
			
		} else {
			int C = A*B;
			System.out.println("A x B = C , portanto C vale " + C );
		}
		
		scan.close();
		

	}

}
