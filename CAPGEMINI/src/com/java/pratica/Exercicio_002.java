package com.java.pratica;

import java.util.Scanner;

public class Exercicio_002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ente com um numero para A e B: ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		int soma = a + b;
		int subt = a-b;
		double div = a/b;
		int mult =a*b;

		System.out.println("Os resultados das operações primarias são:\n SOMA = " + soma + "\n SUBTRAÇÃO= " + subt + "\n DIVISÃO= " + div + "\n MULTIPLICAÇÂO= " + mult);
	
		
		scan.close();
	}

}