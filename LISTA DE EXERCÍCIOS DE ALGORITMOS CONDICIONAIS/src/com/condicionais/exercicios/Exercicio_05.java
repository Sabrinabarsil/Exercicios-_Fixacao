package com.condicionais.exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Numero:  ");
		double num = scan.nextDouble();

		if (num > 0) {
			double dobro = num * 2;
			System.out.println("O numero " + num + " é positivo e seu dobro é " + dobro);
		} else {
			double triplo = num * 3;
			System.out.println("O numero " + num + " é negativo e seu dobro é " + triplo);

		}
		scan.close();
	}

}
