package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ValidadorDeSenhas {
    static String senha;
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((senha = br.readLine())!=null) {

            if (alfaNumerico(senha)&&temMaiusculaMinusculaENumeral()
                &&senha.length()>=6&&senha.length()<=32) {
                System.out.println("Senha valida.");
            } else{
                System.out.println("Senha invalida.");
            }   
        }
	}

    public static boolean alfaNumerico(String string) {
        return string != null && string.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean temMaiusculaMinusculaENumeral() {
        boolean maiuscula = false, minuscula = false, numeral = false;
        for (char caractere : senha.toCharArray()) {
            if(Character.isUpperCase(caractere)) maiuscula = true;
            if(Character.isLowerCase(caractere)) minuscula = true;
            if(Character.isDigit(caractere)) numeral = true;
        }
        return maiuscula&&minuscula&&numeral;
    }
}
