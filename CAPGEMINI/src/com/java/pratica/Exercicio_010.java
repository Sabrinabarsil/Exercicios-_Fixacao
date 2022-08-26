package com.java.pratica;

import java.util.Scanner;

/*
	O custo de um carro novo ao consumidor é a soma do custo de fábrica mais
	o percentual do distribuidor e dos impostos aplicados (primeiro os impostos
	são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor
	sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os
	impostos 45%, escreva um algoritmo que leia o custo de fábrica de um carro e 
	informe o custo ao consumidor do mesmo;
 */


public class Exercicio_010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		


		double custoDeFabrica; 
		double custoConsumidor; // custo de fabrica + percentual do distribuidor + impostos
		double percentualDistribuidor= 0.28;
		double impostos = 0.45;
		double custoDeMaisImposto;
		
		System.out.print("Informe o custo de Fabrica R$ ");
		custoDeFabrica = scan.nextDouble();
		
		custoDeMaisImposto= (custoDeFabrica * impostos) + custoDeFabrica;
		
		custoConsumidor = (custoDeMaisImposto * percentualDistribuidor) + custoDeMaisImposto;
		
		
		System.out.printf("O custo de fabrica de um carro novo é de R$ %.2f" , custoConsumidor);

		scan.close();
		
		
	}

}
