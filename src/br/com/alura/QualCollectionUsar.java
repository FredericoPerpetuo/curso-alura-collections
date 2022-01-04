package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class QualCollectionUsar {

	public static void main(String[] args) {
		Collection<String> nomes = new HashSet<>();
		nomes.add("Artur");
		nomes.add("Dani");
		nomes.add("Fred");
		System.out.println("Coleção: " + nomes);
		System.out.println("Tamanho: " + nomes.size());
		
		System.out.println("-----------------------------------------------");
		
		Collection<String>linguagens = new ArrayList<>();
		linguagens.add("Java");
		linguagens.add("SQL");
		linguagens.add("Javascript");
		System.out.println("Coleção: " + linguagens);
		System.out.println("Tamanho: " + linguagens.size());
		System.out.println("Pegando pelo índice - get(0): " + ((ArrayList<String>) linguagens).get(0));
		System.out.println("Pegando pelo índice - get(1): " + ((ArrayList<String>) linguagens).get(1));
		System.out.println("Pegando pelo índice - get(2): " + ((ArrayList<String>) linguagens).get(2));
	}

}
