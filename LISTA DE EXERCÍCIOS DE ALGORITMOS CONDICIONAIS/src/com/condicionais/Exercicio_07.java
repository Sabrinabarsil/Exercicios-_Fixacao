package com.condicionais.exercicios;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe valores para A, B, C");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if (A < B) {
			if (B < C) {
				System.out.println("Opção 1: A, B, C \n" + A + "\n" + B + "\n" + C);
			} else if (A < C) {
				System.out.printf("Opção 2: A, C, B \n" + A + "\n" + C + "\n" + B);
			} else {
				System.out.printf("Opção 3: C, A, B \n" + C + "\n" + A + "\n" + B);
			}
		}
		if (B < A) {
			if (A < C) {
				System.out.printf("Opção 4: B, A, C \n" + B + "\n" + A + "\n" + C);
			}
			else if (B < C) {
				System.out.printf("Opção 5: B, C, A \n" + B + "\n" + C + "\n" + A);
			} else {
				System.out.printf("Opção 6: C, B, A \n" + C + "\n" + B + "\n" + A);
			}

		}
		scan.close();
	}

}
