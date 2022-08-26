package com.java.pratica;

import java.util.Scanner;

/*
 	Faça um algoritmo que receba um número e mostre
 	uma mensagem caso este número seja maior que 10;
*/

public class Exercicio_011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe um numero: ");
		int num = scan.nextInt();

		if (num > 10) {
			System.out.println("O numero digitador é maior que 10");
		} else {
			System.out.println("O numero digitado é menor que 10");
		}
		
		scan.close();

	}

}
