package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExercicioIterator {

	public static void main(String[] args) {
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		System.out.println("PERCORRENDO COM forEach e lambda");
		letras.forEach(letra -> {
			System.out.println(letra);
		});
		
		System.out.println("\nPERCORRENDO COM Iterator");
		Iterator<String> iterador = letras.iterator();
		
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
