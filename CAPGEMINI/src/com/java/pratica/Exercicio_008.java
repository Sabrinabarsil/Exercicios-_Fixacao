package com.java.pratica;

import java.util.Scanner;

/*
 * A Loja Mamão com Açúcar está vendendo seus produtos
 * em 5(cinco)prestações sem juros. Faça um algoritmo 
 * que receba um valor de uma compra e mostre o valor 
 * das prestações; 
 */

public class Exercicio_008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
	
		
		System.out.print("Informe o valor da sua compra R$ ");
		Double valorCompra = scan.nextDouble();
		
		Double prestacao = valorCompra /5;
		
		
		System.out.printf(" A sua compra foi parcelada em 5x R$ %.2f ", prestacao);
		
		
	
		
		
		scan.close();
		

	}

}
