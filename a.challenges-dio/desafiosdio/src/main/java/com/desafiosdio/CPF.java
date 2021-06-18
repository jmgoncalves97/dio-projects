package com.desafiosdio;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CPF {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));

        Scanner sc = new Scanner(System.in);
        
        // List<String> cpf = new ArrayList<String>();
        String cpf = sc.nextLine();

        String [] cpfArray;
        // String temp = cpf.replace('.','#');
        String caracteres = ".-";
        cpfArray = cpf.split("[" + Pattern.quote(caracteres) + "]");

        // System.out.println(Arrays.asList(cpfArray));
        for (String string : cpfArray) {	
            System.out.println(string);
        }

        sc.close();
    }
}
