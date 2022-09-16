package com.java.collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario ui = new Usuario("Carmen");
		lista.add(ui);
		
		lista.add(new Usuario("Marcella"));
		lista.add(new Usuario("Higor"));
		lista.add(new Usuario("Stephanie"));
		lista.add(new Usuario("Stephanie"));
		lista.add(new Usuario("Bernardo"));
		lista.add(new Usuario("Daniella"));
		
		System.out.println("Acessar pelo indice: " + lista.get(3).nome);
		
		lista.remove(2); // Remover pelo indice
		lista.remove(new Usuario("Daniella")); // remover pelo Objeto
		System.out.println("\nVerificar elemento: " + lista.contains(new Usuario("Higor")));
		
		System.out.println("\nExibindo usuarios: ");
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}

		
		
		
		
	}

}
