package com.java.collections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Conj_Homogeneo {

	public static void main(String[] args) {

		HashSet<String> lista = new HashSet<>(); // Defini o tipo de dado da nossa lista.
		lista.add("Rosa");
		lista.add("Pamela");
		lista.add("Luiz");
		lista.add("Clara");
		lista.add("Renan");

		for (String nome : lista) {
			System.out.println(nome);
		}
		//HasSet não garante a ordenação da lista.
		System.out.println("------------------------------");


		SortedSet<Integer> sorteio = new TreeSet<>(); // Defini o tipo de dado da nossa lista.
		sorteio.add(250);
		sorteio.add(7);
		sorteio.add(821);
		sorteio.add(9);
		sorteio.add(73);

		for (int nums : sorteio) {
			System.out.println(nums);
		}

		/*
		 * SortedSet lista de conj. que possui algum critério de ordenação TreeSet
		 * garante ordem de inserção na lista
		 */

	}

}
