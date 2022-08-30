package com.java.estruturasdecontrole;

import java.util.Scanner;

/*
   9.Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */

public class Exercicio_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero, maiorNumero=0, cont=0;
		
		System.out.println("Informe 10 numeros aleatórios: ");
		
		do {
			System.out.print((1+cont) + "º valor: ");
			 numero = scan.nextInt();
			 
			 if(numero > maiorNumero) {
				 maiorNumero = numero;
				
			 }
			 cont++;
			
		} while(cont != 10);
		
		System.out.println("O Maior numero que você digitou foi " + maiorNumero);

		scan.close();

	}

}
