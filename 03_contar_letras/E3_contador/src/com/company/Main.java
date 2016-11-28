package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// Fal que no sume C si hay una CH, L si hay LL, etc. Ademas de separarlo a funcion.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Primer array (de 27), que tiene todas las letras
        String[] letras = {"A", "B", "C", "CH", "D", "F", "G", "H", "I", "J", "K", "L", "LL", "M",
        "N", "Ñ", "O", "P", "Q", "R", "RR", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        //Segundo array, que tiene tambien 27 char y que suma +1 cuando el caracter del String introducido
        // coincide con el de arriba.
        int[] contadorLetras = new int[27];

        //establecer todos valores a 0, por si acaso
        for (int i = 0; i < 27; i++) {
            contadorLetras[i]=0;
        }

        System.out.print("Inserte cadena de texto: ");
        String texto = br.readLine();
        int longitud = texto.length();
        char caracter;
        //String caracter

        for (int i = 0; i < longitud; i++) {
            caracter = texto.toUpperCase().charAt(i);

            for (int j = 0; j < 27; j++) {
                if (letras[j].charAt(0)==caracter) {contadorLetras[j]+= 1;}
            }


        }

        for (int i = 0; i < 27; i++) {
            System.out.println(letras[i]+" hay "+contadorLetras[i]);
        }


    }
}
