package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println("IMPRIMINDO LISTA");
		System.out.println(aulas);
	
		System.out.println("\nMÉTODO REMOVE");
		aulas.remove(0);
		
		System.out.println(aulas);
		System.out.println("\nFOREACH");
		
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		System.out.println("\nPEGANDO PELO ÍNDICE");
		System.out.println("Primeira aula: " + aulas.get(0));
		
		System.out.println("\nFOR TRADICIONAL");
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula " + i +": " + aulas.get(i));
		}
		
		System.out.println("\nMÉTODO FOREACH");
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		
		System.out.println("\nORDENANDO UMA LISTA");
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Após ordenar: " + aulas);
		

	}

}
