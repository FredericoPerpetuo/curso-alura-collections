package br.com.alura;



public class TestaCursosMelhorado {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole��es do Java", "Paulo Silveira");
		
		//Ap�s o uso de Collections.unmodifiableList, n�o permitir� mais adicionar usando o m�todo add
		//mas somente com o m�todo adiciona da classe Curso
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	
	}
}
