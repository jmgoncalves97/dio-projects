package com.desafiosdio;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetidaNumeros {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Locale.setDefault(new Locale("en", "US"));
		
//declare as variaveis corretamente e continue a sua solução

		List<Integer> numeros  = new ArrayList<>();
		
		int totalNumeros = sc.nextInt();
		while(totalNumeros -->0)
			numeros.add(sc.nextInt());
		
		SortedMap<Integer, Integer> numerosEmOrdem = new TreeMap<>();
		numeros.forEach(numero -> numerosEmOrdem.compute(numero, (chave, valor) -> valor == null? 1: valor+1));
		
	
		// contaQuant.entrySet().forEach(entry->{
		// 	System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
		// });

		numerosEmOrdem.forEach((chave, valor) -> System.out.printf("%d aparece %d vez(es)\n", chave, valor));
		
		sc.close();
	}
}
