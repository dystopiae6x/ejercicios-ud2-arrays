package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] temperaturas;
        temperaturas = new double[5];

        double t;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce temperatura: ");
            t = Double.parseDouble(br.readLine());
            temperaturas[i] = t;
        }

        /*
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            System.out.print(" ---> ");
            System.out.println(temperaturas[i]);

        }
        */


        // Usando los datos contenidos en el array, calcula la temperatura media, la máxima y la mínima.

        double total=0;
        double media;
        double max= Double. MIN_VALUE;
        double min= Double. MAX_VALUE;
        //double max= 9999999;
        //double min= -9999999;

        for (int i = 0; i < 5; i++) {
            total =+ temperaturas[i];


            if (temperaturas[i]>min) {max=temperaturas[i];}
            if (temperaturas[i]>max) {min=temperaturas[i];}

        }

        for (int i = 0; i <24 ; i++) {
            System.out.println(i);
            System.out.println("  ");
            for (int j = 0; j <temperaturas[i]; j++) {
                System.out.println("*");
            }
            System.out.println("  ");
            System.out.println(temperaturas[i]);

            if (temperaturas[i]==min) {System.out.println("MIN");}
            if (temperaturas[i]==max) {System.out.println("MAX");}
        }

        media = total/5;
        System.out.println("");
        System.out.println("La media es: " +media);
        System.out.println("El maximo es: " +max);
        System.out.println("El minimo es: " +min);






    }
}
