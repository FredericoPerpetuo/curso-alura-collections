package br.com.alura;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;


public class ExercicioMap2 {
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);
		
		
		nomesParaIdade.keySet().forEach(nome ->{
			System.out.println(nome);
		});
		
		System.out.println("-------------------------------");
		
		nomesParaIdade.values().forEach(idade ->{
			System.out.println(idade);
		});
		
		System.out.println("-------------------------------");
		
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();   
		
		associacoes.forEach(associacao ->{
			System.out.println(associacao);
		});
		
	}
	
}
