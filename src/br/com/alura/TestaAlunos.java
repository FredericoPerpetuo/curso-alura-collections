package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();

		/**
		 * CARACTER�STICAS DOS SETS 
		 * N�o garantem a ordem dos elementos. 
		 * N�o aceitam elementos repetidos. 
		 * N�o tem m�todo get 
		 * Os m�todos contains e removes s�o mais r�pidos do que no ArrayList e no LinkedList
		 * 
		 */
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Maur�cio Aniche");

		System.out.println("IMPRESS�O DO CONJUNTO");
		System.out.println(alunos);

		System.out.println("\nIMPRESS�O FOR LA�O");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("\nIMPRESS�O FOR M�TODO");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("\nM�TODO CONTAINS");
		System.out.println("Cont�m Fred? " + alunos.contains("Fred"));
		System.out.println("Cont�m Sergio Lopes? " + alunos.contains("Sergio Lopes"));

		System.out.println("\nM�TODO REMOVE");
		alunos.remove("Sergio Lopes");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		/**
		 * Se precisarmos de umas lista podemos cri�-la a partir do set
		 * Agora podemos ordenar, pegar pelo �ndice, etc.
		 * */
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}
}
