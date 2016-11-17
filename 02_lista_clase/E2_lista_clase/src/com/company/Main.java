package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        /*

    Pide al usuario los nombres y apellidos de todos tus compañeros de clase y almacénalos en un array.
    Después pídele usuario una letra y muestra aquellos alumnos cuyo nombre empiece por dicha letra.
    > Nota: El programa termina cuando se escriba `FIN` como búsqueda.

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] lista = new String[3];

        System.out.println("Inserte nombres y apellidos: ");
        for (int i = 0; i < 3; i++) {
            lista[i] = br.readLine();
            ;
        }

        // Hay que enviar los datos del String al ARRAY


        String letra = "0";
        char letra2;


        // Cheat
        System.out.println("Los nombres son: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(lista[i]);
        }

        do {

            System.out.println("Inserte un caracter para iniciar la busqueda: ");
            letra = br.readLine();
            letra2 = letra.charAt(0);

            for (int i = 0; i < 3; i++) {
                if (lista[i].charAt(0) == letra2) {
                    System.out.println(lista[i]);
                }
            }


        } while (!letra.equalsIgnoreCase("fin"));


    }
}
