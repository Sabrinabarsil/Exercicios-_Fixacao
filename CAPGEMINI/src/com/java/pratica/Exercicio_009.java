package com.java.pratica;

import java.util.Scanner;

/*
Faça um algoritmo que receba o preço de custo de um produto
e mostre o valor de venda. Sabe-se que o preço de custo receberá
um acréscimo de acordo com um percentual informado pelo usuário
 */

public class Exercicio_009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o Preço de custo do produt R$ ");
		double custo = scan.nextDouble();
		
		double percentual = custo * 0.60;
		double precoFinal = percentual + custo;
		
		System.out.printf("O valor recomendado para venda do seu produto é de R$ %.2f " , precoFinal);
		
		
		scan.close();

	}

}
