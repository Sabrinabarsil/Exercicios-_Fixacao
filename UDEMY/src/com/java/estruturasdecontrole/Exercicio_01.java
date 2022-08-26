package com.java.estruturasdecontrole;

import java.util.Scanner;

/* 1. Criar um programa que receba um número
 *e verifique se ele está entre 0 e 10 e é par;
 */

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero");
		int num = scan.nextInt();

		if (num > 0 && num <= 10) {
			System.out.println("O numero digitado esta dentro do intervalo de 0 a 10 ");
			if (num % 2 == 0) {
				System.out.println("O numero informado é par");
			} else {
				System.out.println("O numero informado é impar");
			}

		} else {
			System.out.println("O numero digitado NÃO esta dentro do intervalo de 0 a 10 ");
		}
		
		scan.close();

	}

}
