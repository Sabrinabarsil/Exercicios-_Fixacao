package com.condicionais.exercicios;

import java.util.Scanner;

public class Exercicio_06 {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Informe um numero");
	double numero = scan.nextDouble();
	
	double soma;

	if (numero % 2 == 0) {
		soma = numero+5;
		System.out.printf("O numero " + numero + " é par..." + numero + " + 5=" + soma);
                                                    
	} else {                                        
		soma = numero+8;                            
		System.out.printf("O numero " + numero + " é impar..." + numero + " + 8 =" + soma);
	}                                       
	scan.close();
	
}
}
