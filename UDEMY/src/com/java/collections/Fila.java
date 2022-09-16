package com.java.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		fila.add("Romeu");
		fila.add("Suzana");
		fila.add("Tobias");
		fila.offer("Julia");
		fila.offer("Helton");
		fila.offer("Lucio");
		
		System.out.println("Fila: ");
		for (String nome : fila) {
			System.out.println(nome);
		}
		
		
		/*
		 * Offer e Add-> Adicionar elementos na fila 
		 * Diferença entre eles ocorre qndo a fila está cheia 
		 * Offer retorna FALSE e Add lança uma exceção
		 */

		System.out.println("\nPeek: " + fila.peek());
		System.out.println("Element: " +fila.element());

		/*
		 * Peek e Element -> Obtem o prox. elem. da fila sem remover 
		 * Diferença de comportament se dá quando a fila esta vazia 
		 * Peek retorna NULL e Element LANÇA EXCEÇÃO
		 */

		System.out.println("Poll: " + fila.poll());
		System.out.println("Remove: " + fila.remove());
		
		/*
		 * Poll e Remove -> Obtem o prox. elem. da fila e remove
		 * Diferença de comportament se dá quando a fila esta vazia
		 * Poll retorna NULL e Element LANÇA EXCEÇÃO
		 */
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//System.out.println (fila.contains("Mabel")); FALSE
		
		System.out.println("\nFila result");
		for (String nome : fila) {
			System.out.println(nome);
		}

	}

}
