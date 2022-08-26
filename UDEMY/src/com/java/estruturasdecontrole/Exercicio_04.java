package com.java.estruturasdecontrole;

import java.util.Scanner;

// 4. Criar um programa que receba um número e diga se ele é um número primo.

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int contadorDeDivisores = 0;
		System.out.print("Informe um numero para verificar se é primo: ");
		int num = scan.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + num + " é primo.");
		} else {
			System.out.println("\nO numero " + num + " não é primo.");
		}

		scan.close();

		
				
		
	}
}
			
			
		
		
		



