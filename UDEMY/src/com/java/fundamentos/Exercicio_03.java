package com.java.fundamentos;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.print("Qual o seu nome e sobrenone"); String nome =
		 * scan.nextLine(); System.out.print("Qual a sua idade"); int idade =
		 * scan.nextInt();
		 * 
		 * System.out.print("Cadastro efetuado " + nome + " de "+ idade + " anos");
		 * 
		 */

		System.out.print("Informe seus 3 ultimos salarios R$: \n");
		
		String salario1 = scan.nextLine().replace(",", "."); // REPLACE (SUBSTITUIR)
		String salario2 = scan.nextLine().replace(",", ".");;
		String salario3 = scan.nextLine().replace(",", ".");

		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);

		double media = (sal1 + sal2 + sal3) / 3;

		System.out.printf("A media dos salarios é R$ %.2f " ,media);

		scan.close();

	}

}
