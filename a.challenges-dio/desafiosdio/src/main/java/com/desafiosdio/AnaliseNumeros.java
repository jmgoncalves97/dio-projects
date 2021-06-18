package com.desafiosdio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * AnaliseNumeros
 */
public class AnaliseNumeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //declare suas variaveis corretamente
        int[] numeros = new int [5];
        int pares=0, impares=0, positivos=0, negativos=0;

//continue a solução
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(br.readLine());
            if (numeros[i]%2==0) pares++;
            if (numeros[i]%2!=0) impares++;
            if (numeros[i]>0) positivos++;
            if (numeros[i]<0) negativos++;
        }
//insira suas variaveis corretamente
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");
        
        br.close();
    }
}