package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class TestaAlunos {
	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();

		/**
		 * CARACTERÍSTICAS DOS SETS 
		 * Não garantem a ordem dos elementos. 
		 * Não aceitam elementos repetidos. 
		 * Não tem método get 
		 * Os métodos contains e removes são mais rápidos do que no ArrayList e no LinkedList
		 * 
		 */
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Maurício Aniche");

		System.out.println("IMPRESSÃO DO CONJUNTO");
		System.out.println(alunos);

		System.out.println("\nIMPRESSÃO FOR LAÇO");
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println("\nIMPRESSÃO FOR MÉTODO");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("\nMÉTODO CONTAINS");
		System.out.println("Contém Fred? " + alunos.contains("Fred"));
		System.out.println("Contém Sergio Lopes? " + alunos.contains("Sergio Lopes"));

		System.out.println("\nMÉTODO REMOVE");
		alunos.remove("Sergio Lopes");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		/**
		 * Se precisarmos de umas lista podemos criá-la a partir do set
		 * Agora podemos ordenar, pegar pelo índice, etc.
		 * */
		List<String> alunosEmLista = new ArrayList<>(alunos);

	}
}
