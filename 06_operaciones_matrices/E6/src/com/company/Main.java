package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static int[][] suma(int[][] m1, int[][] m2) {


        int filas = m1.length; // Filas de la matriz (de arriba abajo)
        int columnas = m1[0].length; // Columnas de la matriz (izq der)

        // Matriz resultado
        int[][] r = new int[filas][columnas];

        //Recorrer y sumar
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                r[i][j] = m1[i][j] + m2[i][j];
            }

        }

        // Devolver el resultado
        return r;
    }

    public static int[][] productoEscalar(int[][] m, int e) {

        int[][] r = new int[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                r[i][j] = m[i][j] * e;

            }

        }

        return r;
    }

    public static int[][] producto(int[][] m1, int[][] m2) {

        int filas = m1.length; // Filas de la matriz (de arriba abajo)
        int columnas = m1[0].length; // Columnas de la matriz (izq der)

        int[][] r = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < columnas; k++) {

                    r[i][j] = r[i][j] + m1[i][j] * m2[i][j];
                }

            }

        }


        return r;
    }

    public static int[][] traspuesta(int[][] m) {


        int filas = m.length; // Filas de la matriz (de arriba abajo)
        int columnas = m[0].length; // Columnas de la matriz (izq der)

        int[][] r = new int[filas][columnas];
        // Sino fuera cuadrada se invertiria: [columnas][filas]

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                r[i][j] = m[j][i];
                // r[j][i] seria aqui al invertir

            }

        }

        return r;
    }

    public static void visualizar(int[][] m) {

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.format("%4d", m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declarar las variables
        int[][] m1 = new int[4][4];
        int[][] m2 = new int[4][4];

        // Generador de números aleatorios
        Random r = new Random();
        // Si pones Random r = new Random(5); siempre saldria lo mismo, ya que la semilla seria la misma.
        // Son numeros pseudoaleatorios, se generan apartir de la hora del pc (con ms). Es decir eso es la semilla con
        // la que se hara un calculo

        // Inicializamos las matrices
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                m1[f][c] = r.nextInt(10);
                m2[f][c] = r.nextInt(10);
            }
        }

        // Visualizarlas
        System.out.println("m1");
        visualizar(m1);
        System.out.println("m2");
        visualizar(m2);

        // Sumar las matrices
        System.out.println("Suma de m1 + m2");
        visualizar(suma(m1, m2));

        // Producto por un escalar
        System.out.print("Escribe un número: ");
        int n = Integer.parseInt(br.readLine());

        System.out.println("Producto de m1 x n");
        visualizar(productoEscalar(m1, n));

        // Producto
        System.out.println("Producto de m1 x m2");
        visualizar(producto(m1, m2));

        // Traspuesta
        System.out.println("Traspuesta de m2");
        visualizar(traspuesta(m2));

    }
}

//m a secas el numero de filas
//m[0] longitud de columnas