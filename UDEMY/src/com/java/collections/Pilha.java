package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.push("A menina que Roubava Livros");
		livros.push("Filhos do Éden");
		livros.push("O Ultimo Anjo");
		livros.push("Harry Potter");
		livros.push("Ozzob");
		livros.push("As montanhas da Loucura");
		livros.push("O mito de Cthulhu");
		
		//livros.poll();
		//livros.pop();
	
		
		for (String titulos : livros) {
			System.out.println(titulos);
		}
		
		

	}

}
