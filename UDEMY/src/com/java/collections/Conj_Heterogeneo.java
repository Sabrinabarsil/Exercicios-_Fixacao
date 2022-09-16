package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Conj_Heterogeneo {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // notações p/ suprimir os warnings (apenas p/ fins de entendimento do cód)
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(9.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add ('x');// X ja é um elemento existente por isso não é adicionado novamente ao conj.
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		
		conjunto.remove("Teste");
		conjunto.remove("teste");
		conjunto.remove('x');
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		System.out.println(conjunto); // Não ordenado
		
		System.out.println(conjunto.contains('x'));// verifica se existe o elemento especificado
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); // união entre os conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(nums); // retem apenas os elementos de NUMS
		System.out.println(conjunto);
		
		conjunto.clear();// remove todos os elementos
		System.out.println(conjunto);
		
		
		
	}
}
