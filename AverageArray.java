package com.epam.mentoring;

import java.util.Random;

public class AverageArray {
    public static void main(String[] args) {
        Random rand = new Random();
        int array1[] = new int[5];
        int array2[] = new int[5];
        double sum1 = 0;
        double sum2 = 0;
        double average1 = 0;
        double average2 = 0;
        int i = 0;
        System.out.print("Первый массив: ");
        for (i=0; i<5; i++) {
            array1[i] = rand.nextInt(6);
            System.out.print(array1[i] + " ");
            sum1+=array1[i];
                    }
        System.out.print("  Среднее арифметичное массива: " + (average1=sum1/array1.length));
        System.out.println();
        System.out.print("Второй массив: ");
        for (i=0; i<5; i++) {
            array2[i] = rand.nextInt(6);
            System.out.print(array2[i] + " ");
            sum2+=array2[i];
        }
        System.out.print("  Среднее арифметичное массива: " + (average2=sum2/array2.length));
        System.out.println();
        if (average1 > average2)
            System.out.println("Среднее арифметичное перовго массива " + average1 + " больше, чем второго. ");

        if (average2 > average1)
            System.out.println("Среднее арифметичное второго массива " + average2 + " больше, чем первого. ");

        if (average1 == average2) System.out.println("Средние арифметичные массивов равны");
    }
}
