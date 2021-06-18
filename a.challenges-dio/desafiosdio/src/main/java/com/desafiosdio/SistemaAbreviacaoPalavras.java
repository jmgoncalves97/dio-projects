package com.desafiosdio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class SistemaAbreviacaoPalavras {
    private static Map<String, Integer> palavraOcorrencias = new HashMap<>();
    private static Map<Character, String> caracterePalavra = new TreeMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine())!=null) {
            if (line.equals(".")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String palavra = st.nextToken();
                if (palavra.length()<3) {
                    continue;
                }
                palavraOcorrencias.put(palavra, palavraOcorrencias.containsKey(palavra) ? palavraOcorrencias.get(palavra)+1:1);
                caracterePalavra.put(palavra.charAt(0), palavraMaisEconomica(palavra));
            }
            imprimir(line);   
        }
    }
    private static String palavraMaisEconomica(String palavra) {
        if (!caracterePalavra.containsKey(palavra.charAt(0))) {
            return palavra;
        }
        // return caracterePalavra.get(palavra.charAt(0)).length() > palavra.length() ? caracterePalavra.get(palavra.charAt(0)) : palavra;
        int economiaDeCaracteresDaPalavra = palavraOcorrencias.get(palavra) * (palavra.length()-2);

        int tamanhoPalavraDoMap = caracterePalavra.get(palavra.charAt(0)).length()-2;
        int palavraOcorrenciasDoMap = palavraOcorrencias.get(caracterePalavra.get(palavra.charAt(0)));
        int economiaDeCaracteresDaPalavraDoMap = tamanhoPalavraDoMap * palavraOcorrenciasDoMap;

        if (economiaDeCaracteresDaPalavra > economiaDeCaracteresDaPalavraDoMap) {
            return palavra;
        }
        return caracterePalavra.get(palavra.charAt(0));
    }
    private static void imprimir(String line){
        List<String> abreviacoesEPalavrasCorrespondentes = new ArrayList<>();
        for (Character c : caracterePalavra.keySet()) {
            line = line.replaceAll("\\b" +caracterePalavra.get(c)+"\\b", c + ". " );
            abreviacoesEPalavrasCorrespondentes.add(c+". = "+caracterePalavra.get(c));
        }
        System.out.println(line);
        System.out.println(abreviacoesEPalavrasCorrespondentes.size());
        abreviacoesEPalavrasCorrespondentes
        .forEach(elemento -> System.out.println(elemento));
    }
}