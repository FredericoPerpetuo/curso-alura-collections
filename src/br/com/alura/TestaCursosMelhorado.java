package br.com.alura;



public class TestaCursosMelhorado {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		
		//Após o uso de Collections.unmodifiableList, não permitirá mais adicionar usando o método add
		//mas somente com o método adiciona da classe Curso
		//javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		System.out.println(javaColecoes.getAulas());
		
	
	}
}
