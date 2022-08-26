package com.java.fundamentos;

import java.util.Scanner;

/*Criar um programa que leia um valor e apresente os
 *resultados ao quadrado e ao cubo do valor.
 */


public class Exercicio_06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		double valor = scan.nextDouble();
		
		double quadrado= Math.pow(valor, 2);
		double cubo= Math.pow(valor, 3);
		
		System.out.printf("%.0f² é %.0f \n%.0f³ é %.0f ", valor, quadrado, valor, cubo);
		
		
		
		
		scan.close();
	}
}
