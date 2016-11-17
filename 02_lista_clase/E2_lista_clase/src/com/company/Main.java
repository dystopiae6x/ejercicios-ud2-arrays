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

        String[] lista;
        lista = new String[3];

        System.out.println("Inserte nombres y apellidos: ");
        for (int i = 0; i < 3; i++) {
            String insertar = br.readLine();
        }


        String letra ="0";
        char letra2='0';


        do {

            System.out.println("Inserte un caracter para iniciar la busqueda: ");

            letra2 = br.readLine().charAt(0);


            System.out.println("Los nombres son: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(lista[i]);

            }


        } while (letra!="fin");









    }
}
