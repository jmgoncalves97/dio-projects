package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumerosParesImpares {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        int qtdNumeros = sc.nextInt();

        var br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numerosPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        for (int i = 0; i < qtdNumeros; i++) {
            int numero = Integer.parseInt(br.readLine());
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }

        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);
        Collections.reverse(numerosImpares);

        for (Integer numero : numerosPares) {
            System.out.println(numero);
        }
        for (Integer numero : numerosImpares) {
            System.out.println(numero);
        }

        sc.close();
    }
}
