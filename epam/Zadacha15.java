package com.epam.mentoring.epam;

import java.util.Random;

public class Zadacha15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int dvymernuyArray[][] = new int[5][8];
        for (int i=0; i<dvymernuyArray.length; i++) {
            for (int j=0; j<dvymernuyArray[0].length; j++) {
                dvymernuyArray[i][j] = rand.nextInt(199)-99;
                System.out.print("   " + dvymernuyArray[i][j] + "   ");
            }
            System.out.println();
        }
        int max = dvymernuyArray[0][0];
        for (int i=0; i<dvymernuyArray.length; i++) {
            for (int j=0; j<dvymernuyArray[0].length; j++) {
                if (dvymernuyArray[i][j] >= max) max = dvymernuyArray[i][j];
            }
        }
        System.out.println("Максимальный элемент в массиве " + max);
    }
}