package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class ExercicioAplicandoSetNoModelo {
	public static void main(String[] args) {

		Set<String> nomes = Collections.emptySet();
		nomes.add("Paulo"); // o que acontece aqui? java.lang.UnsupportedOperationException
		//pois um conjunto vazio n�o pode receber elementos.
	}
}
