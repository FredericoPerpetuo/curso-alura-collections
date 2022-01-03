package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 =  new Aluno("Rodrigo Turini", 34672);
		Aluno a2 =  new Aluno("Guilherme Silveira", 5617);
		Aluno a3 =  new Aluno("Maurício Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("LISTAGEM DE ALUNOS MATRICULADOS");
		javaColecoes.getAlunos().forEach(aluno->{
			System.out.println(aluno);
		});
		
		//javaColecoes.getAlunos().add(a3);//Não permite usar o método add diretamente, pois a lista retornada é 
		// um unmodifiableSet.

	}

}
