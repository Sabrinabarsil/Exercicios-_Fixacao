package com.java.pratica;

import java.util.Scanner;

/* Escreva um algoritmo que leia o nome de um aluno e as notas das três
 *  provas que ele obteve no semestre. No final informar o nome do aluno
 * e a sua média (aritmética)
 */

public class Exercicio_005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o nome do aluno completo: ");
		String nome = scan.nextLine();

		System.out.println("Informe as notas: 1° Prova Bimestre -- 2° Prova Bimestre -- 3° Prova Bimestre");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		double nota3 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3)/3.0;
		
		System.out.println("O aluno " + nome + " obteve média " + media);
		
		
		scan.close();

	}
}