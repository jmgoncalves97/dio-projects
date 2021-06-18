package com.desafiosdio;

import java.io.IOException;
import java.util.Scanner;

public class Pares {
	
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
    	for (int i = 0 ;i <= num ; i++) {
    		if (i%2==0){
                System.out.println(i);
            }
    	}
        in.close();
    }
	
}