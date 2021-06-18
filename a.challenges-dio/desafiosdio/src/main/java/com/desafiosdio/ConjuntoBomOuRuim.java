package com.desafiosdio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConjuntoBomOuRuim {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int tamanhoConjunto = in.nextInt();
            if(tamanhoConjunto==0) break;

            List<String> conjunto = new ArrayList<>();

            for (int i = 0; i <= tamanhoConjunto-1; i++) {
                conjunto.add(in.next());
            }
            System.out.println(cojuntoEBom(conjunto)==false?"Conjunto Ruim":"Conjunto Bom");
        }
        in.close();
    }

    public static boolean cojuntoEBom(List<String> conjunto){
        Collections.sort(conjunto);
        for (int i = 0; i < conjunto.size()-1; i++) {
            if (conjunto.get(i+1).startsWith(conjunto.get(i))) {
                return false;
            }
        }
        return true;
    }
}
