package com.java.fundamentos;

import java.util.Scanner;

/*Criar um programa que leia o valor da base
 *e da altura de um triângulo e calcule a área.
 */

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o valor da base: ");
		double base = scan.nextDouble();

		System.out.print("Informe o valor da altura: ");
		double altura = scan.nextDouble();

		double area = base * altura;

		System.out.printf(" A area do seu triangulo mede %.2f ", area);

		scan.close();

	}

}
