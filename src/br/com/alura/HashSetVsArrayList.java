package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetVsArrayList {
	public static void main(String[] args) {

		Collection<Integer> numerosArrayList = new ArrayList<>();

		long inicioArrayList = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numerosArrayList.add(i);
		}

		for (Integer numero : numerosArrayList) {
			numerosArrayList.contains(numero);
		}

		long fimArrayList = System.currentTimeMillis();

		long tempoDeExecucaoNoArrayList = fimArrayList - inicioArrayList;

		System.out.println("Tempo gasto no ArrayList " + tempoDeExecucaoNoArrayList + "ms");
		

		Collection<Integer> numeros = new HashSet<>();

		long inicioHashSet = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fimHashSet = System.currentTimeMillis();

		long tempoDeExecucao = fimHashSet - inicioHashSet;

		System.out.println("Tempo gasto no HashSet: " + tempoDeExecucao + "ms");

	}

}
