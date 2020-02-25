package com.epam.mentoring;

import java.util.Random;

public class IncrisingSequence {
    public static void main(String[] args) {
        int[] arraySequence = new int[4];
        Random objectArray = new Random();
        for (int i=0; i<4; i++) {
            arraySequence[i] = objectArray.nextInt(90+10);
            System.out.print(arraySequence[i] + " ");
        }
        System.out.println();
    if ((arraySequence[3] > arraySequence[2]) && (arraySequence[2] > arraySequence[1]) && (arraySequence[1] > arraySequence[0])) {
        System.out.println("Данный массив чисел - строго возрастающая последовательность. ");
    }
    else System.out.println("Данный массив чисел не возрастающая последовательность. ");
    }
}
