package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ExercicioSet {
	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();

		alunos.add("Artur");
		alunos.add("Daniela");
		alunos.add("Fred");

		System.out.println("Tamanho do set: " + alunos.size());

		alunos.add("Daniela");

		System.out.println("Tamanho do set após tentar inserir aluno repetido: " + alunos.size());

		System.out.println("--------------------------------------------------------------------------");
		
		Set<String> alunos2 = new HashSet<>();
		alunos2.add("Paulo");
		alunos2.add("Alberto");
		alunos2.add("Pedro");

		System.out.println(alunos2.size());

		// tente adicionar um aluno que existe
		alunos.add("Pedro");

		System.out.println(alunos2.size());

		boolean adicionou = alunos2.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}

}
