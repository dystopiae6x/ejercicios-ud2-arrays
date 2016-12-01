package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] array1 = new int[4];
        int[] array2 = new int[4];
        int[] result = new int[4];

        //Dar valores a los arrays
        for (int i = 0; i < 4; i++) {
            array1[i]=1;
            array2[i]=2;
        }


        //Sumar los 2 arrays
        for (int i = 0; i < result.length; i++) {
            result[i]=array1[i]+array2[i];

        }


        // Mostrar los 2 arrays y el resultado de la suma
        for (int i = 0; i < 4; i++) {
            //System.out.println(array1[i]);
            System.out.format("%3d", array1[i]);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            //System.out.println(array2[i]);
            System.out.format("%3d", array2[i]);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.format("%3d", result[i]);
        }
    }
}
