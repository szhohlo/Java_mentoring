package com.epam.mentoring;

import java.util.Random;

public class ReplacementArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arrayReplacement[] = new int[8];
        int i;
        for (i=0; i<8; i++) {
            arrayReplacement[i] = random.nextInt(10) + 1;
            System.out.print(arrayReplacement[i] + " ");
        }
        System.out.println();
        for (i=0; i<8; i++) {
            if (i % 2 != 0) arrayReplacement[i] = 0;
            System.out.print(arrayReplacement[i] + " ");
        }
    }
}
