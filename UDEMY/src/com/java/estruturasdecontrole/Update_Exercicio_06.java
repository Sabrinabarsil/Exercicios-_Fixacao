package com.java.estruturasdecontrole;

import java.util.Random;
import java.util.Scanner;

public class Update_Exercicio_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int num;
		int numeroSorteado;
		int tentativas;
		int continuar;
		
		do {
			System.out.print("Sorteadndo numero de 0 a 100 . . .[ ? ]");
			numeroSorteado = gerador.nextInt(101);
			
			System.out.print("\nJOGO DE ADIVINHAÇÃO... VAMOS BRINCAR?!?");
			tentativas=11;
			
			do {
				tentativas--;
				System.out.print("\nVocê tem " + tentativas + " tentativas!\nInforme  um numero: ");
				num = scan.nextInt();
				
				if(num > numeroSorteado) {
					System.out.println("Você não acertou! O numero digitado é maior que o numero secreto!");
				}
				else if(num < numeroSorteado) {
					System.out.println("Você não acertou! O numero digitado é menor que o numero secreto!");
				}else {
					System.out.println("Parabéns você acertou");
				} 
				}while(num != numeroSorteado);
				System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar: ");
				continuar = scan.nextInt();
				
			} while (continuar != 0);
		
				
		
		
		scan.close();

	}

}
