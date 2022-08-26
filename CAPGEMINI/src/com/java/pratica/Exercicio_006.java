package com.java.pratica;

import java.util.Scanner;

/*Leia dois valores para as variáveis A e B, e efetuar as trocas
 * dos valores de forma que a variávelA passe a possuir o valor da
 * variável B e a variável B passe a possuir o valor da variável A.
 * Apresentar osvalores trocados;
 */

public class Exercicio_006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um valor para A e outro para B");
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println("Antes da troca");
		System.out.print("A = " + a + "\nB= " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("\n \nDepois da troca");
		System.out.print("A = " + a + "\nB= " + b);
scan.close();
	}

}
