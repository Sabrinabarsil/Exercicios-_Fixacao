package com.java.pratica;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo
 e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo qu
 este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar 
 o seu nome, o salário fixo e salário no final do mês;
*/

public class Exercicio_004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
				
	System.out.println("Informe o nome do Vendedor: ");
	String nome = scan.nextLine();
	
	System.out.println("Informe seu salario fixo em R$: ");
	double salario = scan.nextDouble();
	
	System.out.println("Informe o valor total das suas vendas esse mês R$: ");
	double vendas = scan.nextDouble();
	
	double salarioFinal = (vendas * 0.15) + salario ;
	

	
	System.out.println("\nOlá " + nome + "\nEsse mês seu salario R$" + salario + " somado a comissão de 15%, totaliza R$" + new DecimalFormat("#,##0.00").format(salarioFinal) );

	scan.close();
	
	}

}
