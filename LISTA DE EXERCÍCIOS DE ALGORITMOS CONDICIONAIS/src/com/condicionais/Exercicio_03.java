package com.condicionais.exercicios;

import java.util.Scanner;

//2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
//estado civil seja “CASADA”, solicitar o tempo de casada (anos). 

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero");
		double numero = scan.nextDouble();

		if (numero % 2 == 0) {
			System.out.println("O numero " + numero + " é Par");

		} else {
			System.out.println("O numero " + numero + " é impar");
		}
		scan.close();
	}

}
