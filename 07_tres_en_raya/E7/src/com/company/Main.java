package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void visualizarTablero(int[][] tablero) {
        System.out.println("Tablero: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                /*switch (tablero[i][j]){


                }*/
                System.out.format("%2d", tablero[i][j]);
            }
            System.out.println("");
        }
        System.out.println("----------");
    }

    public static int comprobarGanador(int r) {
        //funcion que se deberia utilizar y no he utilizado. Pero funciona!!
        return r;
    }


    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Diseñamos el tablero: matriz 3x3

        final int filas = 3;
        final int columnas = 3;

        int[][] tablero = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j]= 5 ;
            }
        }




        // Insertar datos
        byte ganador1=0,ganador2=0, empate=0, turno=0;
        while (ganador1==0 && ganador2==0 && empate==0) {
            System.out.println("\nTurno de jugador 1, elija casilla: ");
            System.out.println("1 2 3\n4 5 6\n7 8 9");
            int jugador1 = Integer.parseInt(br.readLine());

            switch (jugador1) {
                case 1:
                    tablero[0][0] = 0;
                    break;
                case 2:
                    tablero[0][1] = 0;
                    break;
                case 3:
                    tablero[0][2] = 0;
                    break;

                case 4:
                    tablero[1][0] = 0;
                    break;
                case 5:
                    tablero[1][1] = 0;
                    break;
                case 6:
                    tablero[1][2] = 0;
                    break;

                case 7:
                    tablero[2][0] = 0;
                    break;
                case 8:
                    tablero[2][1] = 0;
                    break;
                case 9:
                    tablero[2][2] = 0;

            }

            visualizarTablero(tablero);

            //Verificar ganador
            if (tablero[0][0]==0 && tablero[0][1]==0 && tablero[0][2]==0) {ganador1=1;}
            if (tablero[1][0]==0 && tablero[1][1]==0 && tablero[1][2]==0) {ganador1=1;}
            if (tablero[2][0]==0 && tablero[2][1]==0 && tablero[2][2]==0) {ganador1=1;}
            if (tablero[0][0]==0 && tablero[1][1]==0 && tablero[2][2]==0) {ganador1=1;}
            if (tablero[2][0]==0 && tablero[1][1]==0 && tablero[0][2]==0) {ganador1=1;}

            if (tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1) {ganador2=1;}
            if (tablero[1][0]==1 && tablero[1][1]==1 && tablero[1][2]==1) {ganador2=1;}
            if (tablero[2][0]==1 && tablero[2][1]==1 && tablero[2][2]==1) {ganador2=1;}
            if (tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1) {ganador2=1;}
            if (tablero[2][0]==1 && tablero[1][1]==1 && tablero[0][2]==1) {ganador2=1;}

            turno +=1; if (turno==9) {empate=1;}



            if (ganador1==0 && ganador2==0 && empate==0) {
                System.out.println("\nTurno de jugador 2, elija casilla: ");
                System.out.println("1 2 3\n4 5 6\n7 8 9");
                int jugador2 = Integer.parseInt(br.readLine());

                switch (jugador2) {
                    case 1:
                        tablero[0][0] = 1;
                        break;
                    case 2:
                        tablero[0][1] = 1;
                        break;
                    case 3:
                        tablero[0][2] = 1;
                        break;

                    case 4:
                        tablero[1][0] = 1;
                        break;
                    case 5:
                        tablero[1][1] = 1;
                        break;
                    case 6:
                        tablero[1][2] = 1;
                        break;

                    case 7:
                        tablero[2][0] = 1;
                        break;
                    case 8:
                        tablero[2][1] = 1;
                        break;
                    case 9:
                        tablero[2][2] = 1;

                }

                visualizarTablero(tablero);
            } else {break;}


            if (ganador1==1){
                System.out.println("¡Ha ganado el jugador 1!");
            } else if (ganador2==2) {
                System.out.println("¡Ha ganado el jugador 2!");
            } else {
                System.out.println("Habeis empatado");
            }




        }

    }
}
