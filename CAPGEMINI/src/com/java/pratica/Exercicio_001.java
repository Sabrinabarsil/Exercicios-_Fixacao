package com.java.pratica;

import java.util.Scanner;

public class Exercicio_001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ente com um numero para A e B: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int soma = a + b;

		System.out.println(" A soma dos valores informados é: " + soma);
	
		
		scan.close();
	}

}