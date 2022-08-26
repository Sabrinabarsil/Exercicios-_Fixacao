package com.java.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double total = 0, mediaTurma, nota = 0;
		int cont = 0;

		System.out.println("Informe a nota dos alunos dessa turma (#Para encerrar o programa digite -1#)");

		while (nota != -1) {

			System.out.print("Informe a nota do proximo alunos:");
			nota = scan.nextDouble();
			
			if(nota>=0 && nota <=10) {
				total += nota;
				cont++;
			} else if (nota != -1) {
				System.err.print("Nota Invalida\n");
			}
			

		}
		mediaTurma = total / cont;

		System.out.printf("A média da turma é de %.1f " , mediaTurma);
		scan.close();
	}

}
