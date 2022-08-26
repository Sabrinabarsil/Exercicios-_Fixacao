package com.java.pratica;

import java.util.Scanner;

/*
 Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */

public class Exercicio_012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe  2 valores: ");
		System.out.print("Valor 1: ");
		int a = scan.nextInt();
		System.out.print("Valor 2: ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("O maior valor é " + a);
		}
		else if(b>a) {
			System.out.println("O maior valor é " + b);
		}
		else {
			System.out.println("O valores não podem ser iguais, por favor informe valores diferentes");
		}

		
		scan.close();
	}

}
