package com.loops.exercicios;

public class Exercicio_03 {
	public static void main(String[] args) {

		int soma=0;
		int i;

		for ( i = 0; i < 500; i++) {
			if(i %3==0) {
				soma= soma+ i;
			}

		}
		
		System.out.println(soma);
	}
}
