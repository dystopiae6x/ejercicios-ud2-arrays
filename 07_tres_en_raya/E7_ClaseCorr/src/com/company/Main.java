package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int[][] t){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                switch (t[i][j]) {
                    case 0:
                        System.out.print(" o ");
                        break;
                    case 1:
                        System.out.print(" x ");
                        break;
                    case 7:
                        System.out.print(" . ");
                        break;
                }

            }
            System.out.println();
        }
    }

    public static boolean comprobarGanador(int[][]t) {
        for (int i = 0; i < 2; i++) {
            if (t[0][0]==i && t[0][1]==i && t[0][2]==i) {return true;}
        }

        //...
        // Mirar el de Ion. Y como optimizarlo al final del video.

        return false;
    }

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Crear el tablero
        int[][] tablero = new int[3][3];

        // Inicializar las casillas vacias
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j]=7;

            }

        }


        // Bucle de juego

        // Mostrar el tablero
        visualizarTablero(tablero);

        //Hay ganador
        if (comprobarGanador(tablero)) {
            System.out.println("¡Has ganado!");}

        // Ver a quien le toca jugar
        int turno = 0;
        int tiradas = 0;

        do {
            // El jugador elije casilla
            System.out.println("Fila (0-2): ");
            int fila = Integer.parseInt(br.readLine());
            System.out.println("Columna (0-2): ");
            int columna = Integer.parseInt(br.readLine());

            if(tablero[fila][columna]== 7){
                // Valida
                tablero[fila][columna]=turno;

                //Contabilizar la tirada
                tiradas +=1;

                // Cambio de turno
                if (turno==0) {turno=1;}
                else {turno=0;}

                // Mostrar el tablero
                visualizarTablero(tablero);
            }else{
                System.out.println("Casilla ocupada...");
            }
        } while (tiradas <9 && !comprobarGanador(tablero));

        // ¿Por que hemos parado?
        if (tiradas<9){
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("Empate...");
        }


    }
}
