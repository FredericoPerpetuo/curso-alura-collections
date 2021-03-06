package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as cole??es do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole??es", 22));
		
		Aluno a1 =  new Aluno("Rodrigo Turini", 34672);
		Aluno a2 =  new Aluno("Guilherme Silveira", 5617);
		Aluno a3 =  new Aluno("Maur?cio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("LISTAGEM DE ALUNOS MATRICULADOS");
		javaColecoes.getAlunos().forEach(aluno->{
			System.out.println(aluno);
		});
		System.out.println("------------------------------------------------");
		//javaColecoes.getAlunos().add(a3);//N?o permite usar o m?todo add diretamente, pois a lista retornada ? 
		// um unmodifiableSet.
		
		System.out.println("O aluno a1 est? matriculado? " + javaColecoes.estaMatriculado(a1));
		System.out.println("------------------------------------------------");
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("A1 ? IGUAL A TURINI?");
		System.out.println("a1.equals(turini): " + a1.equals(turini));
		System.out.println("a1.hashCode() == turini.hashCode(): " + (a1.hashCode() == turini.hashCode()));

	}

}
