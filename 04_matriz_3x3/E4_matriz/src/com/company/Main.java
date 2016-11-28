package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // int[][] = new int[3][3];
        int[][] matriz;
        matriz = new int[3][3];


        // Insertar valores en matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Introduce valor: ");
                matriz[i][j] = Integer.parseInt(br.readLine());
            }
        }

        // Mostrar matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%4d", matriz[i][j]);
            }
            System.out.println();
        }

        //System.out.format requiere la indicacion del formato: La d es de digit. El 4 es una anchura de 4 caracteres.
        // El System.out.println(); mete un salto de linea cada 3 vueltas.

    }
}
