package com.java.pratica;

import java.util.Scanner;


/*
 * Faça um algoritmo que receba um valor que foi 
 * depositado e exiba o valor com rendimento após
 * um mês.Considere fixo o juro da poupança em 0,07% a. m;
 */


public class Exercicio_007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o Valor depositado R$ ");
		Double valor = scan.nextDouble();
		
		Double rendimento = valor * 0.07;
		
		Double soma = valor + rendimento;
		
		System.out.printf("\nVocê investiu R$ %.2f \nEsse investimento renderá R$ %.2f a.m \nTotalizando R$ %.2f", valor ,rendimento , soma);
		scan.close();	
		
	}

}
