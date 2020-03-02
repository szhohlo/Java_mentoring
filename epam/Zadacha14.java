package com.epam.mentoring.epam;

import java.util.Random;

public class Zadacha14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int dvymernuyArray[][] = new int[8][5];
        for (int i=0; i<dvymernuyArray.length; i++) {
            for (int j=0; j<dvymernuyArray[0].length; j++) {
                dvymernuyArray[i][j] = rand.nextInt(90)+10;
                System.out.print(" " + dvymernuyArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
