package com.java.estruturasdecontrole;

import java.util.Scanner;

/*
   9.Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */



public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int numeros[] = new int [10];
		int i;
		
		System.out.print("Informe 10 numeros a seu critério\n");
		for(i=0 ; i < numeros.length; i++) {
			System.out.print("numero: ");
			numeros[i] = scan.nextInt();
			
		}
		
		System.out.println(numeros[i] + "numeros ");
		
		
		
		
		scan.close();

	}

}
