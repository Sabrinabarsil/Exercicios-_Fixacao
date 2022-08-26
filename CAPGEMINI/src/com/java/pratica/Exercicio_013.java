package com.java.pratica;

import java.util.Scanner;

/*
 Faça um algoritmo que receba um número e diga se este
 número está no intervalo entre 100 e 200; 
*/

public class Exercicio_013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int num = scan.nextInt();

		if (num >= 100 && num <= 200) {
			System.out.println("O valor que você digitou esta no intervalo entre 100 e 200");
		} else if (num <= 99) {
			System.out.println("O valor digitado é menor que 100");
		} else {
			System.out.println("O valor digitado é maior que 200");
		}

		scan.close();

	}
}
