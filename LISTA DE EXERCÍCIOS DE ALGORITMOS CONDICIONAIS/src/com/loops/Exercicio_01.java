package com.loops.exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

double nota;
        
        do{
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextDouble();
            
            if(nota < 0 || nota > 10){
                System.out.println("Valor Incorreto!");
                
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Correto!");
	scan.close();
	}
}
