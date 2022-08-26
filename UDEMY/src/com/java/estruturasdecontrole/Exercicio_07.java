package com.java.estruturasdecontrole;

import java.util.Scanner;

/* 
 7. Criar um programa que enquanto estiver recebendo
 números positivos, imprime no console a soma dos números
 inseridos, caso receba um número negativo, encerre o programa.
 Tente utilizar a estrutura do while.
 */


public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int soma=0;
		int num=0;
		
		System.out.println("Vamos somar os numeros #Para sair digite -1#");
		while (num >= 0) {
			System.out.print("Informe um numero:");
			num = scan.nextInt();
			if(num >= 0) {
				soma += num; 
				System.out.println("soma = " + soma);
			}
			
		}
		
		
		
		
		
		
		
		scan.close();

	}

}
