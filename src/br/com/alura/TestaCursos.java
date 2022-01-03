package br.com.alura;

import java.util.List;

public class TestaCursos {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		
		aulas.add(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getAulas());
		
		System.out.println(javaColecoes.getAulas());
		
		if(aulas == javaColecoes.getAulas()) {
			System.out.println("Duas refer�ncias para o mesmo objeto!!");
		}
	}
}
