package com.desafiosdio;

import java.io.IOException;
import java.util.Scanner;

public class ConsumoMedioAutomovel {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int distancia = leitor.nextInt();
        double consumo = leitor.nextDouble();

        double media = distancia/consumo;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l",media));

        leitor.close();
    }
}
