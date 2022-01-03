package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursosMelhorado2 {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);
		//Collections.sort(aulasImutaveis); // N�o permite modifica��o 
		
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		
		System.out.println("Tempo total: " + javaColecoes.getTempoTotal());
		
		System.out.println(javaColecoes);
		
	
	}
}
