package com.java.fundamentos.desafios;

public class Desafio_Sorvete {

	public static void main(String[] args) {
		
		boolean trabalho1= false;
		boolean trabalho2= false;
		
		
		boolean comprarTv50= trabalho1 && trabalho2;
		boolean comprarTv32= trabalho1 ^ trabalho2;
		boolean comprarSorvete= trabalho1 || trabalho2;
		
		System.out.println("Comprou a tv de 50\"? " + comprarTv50);
		System.out.println("Comprou a tv de 32\"? " + comprarTv32);
		System.out.println("Tomou sorvete ? " + comprarSorvete);
		System.out.println("Melhor não ter tomado sorvete e economizado umas calorias? " + !comprarSorvete);

		
		

	}

}
