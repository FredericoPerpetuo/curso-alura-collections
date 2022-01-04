package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaIterator {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		Aluno a1 =  new Aluno("Rodrigo Turini", 34672);
		Aluno a2 =  new Aluno("Guilherme Silveira", 5617);
		Aluno a3 =  new Aluno("Maur�cio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()){//Equanto houver outro elemento
			Aluno proximo = iterador.next();//Pegue o pr�ximo
			System.out.println(proximo);
		}
		
		//Aluno depoisDoUltimo = iterador.next(); //java.util.NoSuchElementException
		

	}

}
