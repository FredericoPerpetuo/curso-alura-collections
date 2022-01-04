package br.com.alura;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo();
		
		Recibo rec2 = new Recibo();
		
		Recibo rec3 = new Recibo();
		
		
		Set<Recibo> recibos = new TreeSet<>(new Comparator<Recibo>() {
			@Override
			public int compare(Recibo r1, Recibo r2) {
				return 0;
			}
		});
		
		recibos.add(rec1);
		recibos.add(rec2);
		recibos.add(rec3);
	}

}
