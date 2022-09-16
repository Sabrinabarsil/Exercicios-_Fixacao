package com.condicionais.exercicios;

import java.util.Scanner;

//1) Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor
//que C. 

public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe valores para A, B e C");
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();

		double soma = A + B;
		if (soma < C) {
			System.out.println("A soma de A + B é MENOR que C");
		} else {
			System.out.println("A soma de A + B é MAIOR que C");
		}
		scan.close();
	}
}
