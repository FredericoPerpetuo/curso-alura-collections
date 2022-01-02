package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class ExercicioTestandoListas {

	public static void main(String[] args) {

		ArrayList<String> cursos = new ArrayList<>();
		String c1 = "Git";
		String c2 = "POO";
		String c3 = "EJB";
		String c4 = "JPA";
		String c5 = "JDBC";
		String c6 = "Azure";
		
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		cursos.add(c4);
		cursos.add(c5);
		cursos.add(c6);
		
		imprime(cursos);
		
		System.out.println("--------------------------------------------------");
		cursos.remove(1);
		imprime(cursos);
		
		System.out.println("--------------------------------------------------");
		System.out.println("Primeiro curso: " + cursos.get(0));
		
		System.out.println("--------------------------------------------------");
		Collections.sort(cursos);
		System.out.println("Após ordenar: ");
		imprime(cursos);
	}

	private static void imprime(ArrayList<String> cursos) {
		cursos.forEach(curso ->{
			System.out.println(curso);
		});
	}

}
