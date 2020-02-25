package com.epam.mentoring;

import java.util.Random;

public class Zadacha8 {


    private int test;

    public int[] generateRandomArray(int arrayLength) {
        int array[] = new int[arrayLength];
        Random rand = new Random();
        int i;
        for (i = 0; i < arrayLength; i++) {
            array[i] = rand.nextInt(31) - 15;
        }

        return array;
       // Main.printArray(array);
       // System.out.print(array[i] + " ");
    }

    public int findMaxElement (int array[]) {

        int max = array[0];
        int i = 0;
        for (i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        return max;
    }
    public int indeksVhozhdeniyaMaxElementaVmassiv (int max, int array[]) {
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[jMax]) {
                jMax = i;
            }
        }
        return jMax;
    }

}

        /*int max = array[0];
        for (i = 1; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Max element: " + max);

        int jMax = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] >= array[jMax]) {
                jMax = i;
            }
        }
        System.out.println("Indeks poslednego vhojdeniya elementa v massiv - " + jMax);
    }
} */
//------------------------------------------------------

       // System.out.println("Max element: " + max);



