package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CorrigindoPalavras {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String palavra;

        while ((palavra = br.readLine())!=null) {
            boolean repetiu=false;
            
            for (int i = 1; i <= palavra.length()-1; i++) {
                if (palavra.substring(0, i).endsWith(palavra.substring(i))){
                    System.out.println(palavra.substring(0, i));
                    repetiu = true;
                }
            }
            if (!repetiu) System.out.println(palavra);
        }
    }
}
