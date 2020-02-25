package com.epam.mentoring;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int array[] = new int[15];
        Random rand = new Random();
        int counter = 0;
        int i;
        for (i=0; i<15; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " "); }
        for (i=0; i<15; i++) {
            if (array[i]%2 == 0) counter++ ;
        }
        for (i=0; i<15; i++) {
            if (array[i] == 0) counter-- ;
        }
        System.out.println();
        System.out.println("Количество четных элементов в массиве: " + counter);

    }
}
