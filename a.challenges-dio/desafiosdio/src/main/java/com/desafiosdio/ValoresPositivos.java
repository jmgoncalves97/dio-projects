package com.desafiosdio;

import java.util.Scanner;

// Desafio
// Crie um programa que leia 6 valores. Você poderá receber valores negativos
// e/ou positivos como entrada, devendo desconsiderar os valores nulos. Em seguida,
// apresente a quantidade de valores positivos digitados.

// Entrada
// Você receberá seis valores, negativos e/ou positivos.

// Saída
// Exiba uma mensagem dizendo quantos valores positivos foram lidos assim como é
// exibido abaixo no exemplo de saída. Não esqueça da mensagem "valores positivos"
// ao final.

public class ValoresPositivos {
    public static void main(String[] args) {

        String [] valoresString = new String [6];
        double [] valoresInt = new double [6];

        int positivos = 0;
        int vazios =0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < valoresString.length; i++) {
            valoresString[i] = in.nextLine();
            if (valoresString[i].equals("")) {
                continue;
            }
            valoresInt[i] = Double.parseDouble(valoresString[i]);
        }

        for (int i = 0; i < valoresInt.length; i++) {
            if (valoresInt[i]>=0) {
                positivos++;
            }
            if (valoresString[i].equals("")) {
                vazios++;
            }
        }

        System.out.println((positivos-vazios)+" valores positivos");

        in.close();
    }
}
