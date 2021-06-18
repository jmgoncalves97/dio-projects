package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstringComum {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String string1, string2 , maior, menor; //declare suas variaveis aqui
        while ((string1 = in.readLine()) != null) { // complete seu código
            string2 = in.readLine();
            if (string1.length()>string2.length()) {  
               maior = string1;
               menor = string2;
            } else {
                maior = string2;
                menor = string1;
            }
            int minLength = menor.length();
            int sequenciaMaxima = minLength;
            boolean f = true;
            while (sequenciaMaxima > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - sequenciaMaxima;
                for (int i = 0 ; i <= diff ;i++ ) { //complete o laco de repeticao
                    if (maior.contains(menor.substring(i, i + sequenciaMaxima))) {
                        f = false;
                        sequenciaMaxima++;
                        break;
                    }
                }
                sequenciaMaxima--;
            }
            System.out.println(sequenciaMaxima);
        }
        out.close();
    }
}
