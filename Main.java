package com.epam.mentoring;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Zadacha8 zadacha = new Zadacha8();
        int[] array = zadacha.generateRandomArray(10);
       // print(array);

        int max = zadacha.findMaxElement(array);
        System.out.println();
        System.out.println("Max element v massive: " + max);
        int jMax = zadacha.indeksVhozhdeniyaMaxElementaVmassiv(max, array);
        System.out.println();
        System.out.println("Indeks vhozhdeniya max elementa v massiv "+ jMax);


        Zadacha9 task9 = new Zadacha9();
        task9.run();
        Zadacha10 task10 = new Zadacha10();
        task10.run(11, 3, -1);
    }



    }



