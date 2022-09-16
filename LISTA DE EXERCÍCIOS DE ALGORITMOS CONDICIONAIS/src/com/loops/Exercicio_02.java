package com.loops.exercicios;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome, senha;
		System.out.println("Digite seu nome : ");
		nome = scan.next();

		do {

			System.out.println("Digite sua senha : ");
			senha = scan.next();

			if (senha.equalsIgnoreCase(nome)) {
				System.err.println("Sua senha Não pode ser o seu nome");

			} else {
				System.out.println("Login efetuado com sucesso!");
			}

		} while (senha.equals(nome));
		
		scan.close();
	}
}
