package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DescobrirNumero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

//declare suas variaveis
        int divisor = Integer.parseInt(st.nextToken()); //2
        int naoDivisor = Integer.parseInt(st.nextToken());//12
        int multiplo = Integer.parseInt(st.nextToken());//8
        int naoMultiplo = Integer.parseInt(st.nextToken());//2
        br.close();   

        //declare suas variaveis com o valor correto 
        int numeroPensado = -1;       

//continue o codigo
        if (multiplo % divisor==0){// 8%2==0
            for (int i = 1; i < multiplo/divisor; i++) {
                int n = divisor*i;
                if(n%naoDivisor!=0 && multiplo%n==0 && naoMultiplo%n!=0){
                    numeroPensado = n;
                    break;
                }
            }
        }
        System.out.println(numeroPensado);        
    }
}
