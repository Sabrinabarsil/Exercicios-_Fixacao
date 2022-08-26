package com.java.estruturasdecontrole;

import java.util.Random;
import java.util.Scanner;


/*
 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
 * Armazene um numero aleatório em uma variável. O Jogador tem 10
 * tentativas para adivinhar o número gerado. Ao final de cada 
 * tentativa, imprima a quantidade de tentativas restantes, e imprim
 * se o número inserido é maior ou menor do que o número armazenado.
 */


public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		Random gerador = new Random();
		 
		int numeroAleatorio = gerador.nextInt(100);
		int tentativas =9;
		
		System.out.print("JOGO DE ADIVINHAÇÃO... VAMOS BRINCAR?!?");
		
		System.out.print("\nInforme um numero entre 0 e 100\nVocê tem 10 tentativas:");
		int num = scan.nextInt();
		
	
		while (num != numeroAleatorio ) {
			System.out.println("Você errou!\nAinda te resta " + tentativas-- + " tentativas\nInforme um numero entre 0 e 100: ");
						num = scan.nextInt();
			
		}
		
		System.out.println("Você Acertou!!! Parabéns" + numeroAleatorio);
		
		scan.close();

	}

}
