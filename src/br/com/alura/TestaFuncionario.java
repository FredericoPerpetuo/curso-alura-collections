package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Paulo", 25);
        Funcionario f2 = new Funcionario("Aline", 22);
        Funcionario f3 = new Funcionario("Luana", 30);
        Funcionario f4 = new Funcionario("Carlos", 50);
        Funcionario f5 = new Funcionario("Bruna", 35);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.print(iterador.next().toString());
        } 
        
    }

}
