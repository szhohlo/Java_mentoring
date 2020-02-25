/* 10.	Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего. */

package com.epam.mentoring;

import java.util.Random;

public class Zadacha10 {
    public static void run(int arraylength, int n, int k) {
           //n - диапазон интервала,  к - смещение интервала
            Random rand = new Random();
            int i=0; //счетчик элементов массива
            int randomArray[] = new int[arraylength];
            System.out.println("------------------Задача 10---------------------");
            System.out.println("Массив cлучайных чисел в диапазоне [-1; 1]:  ");
            for (i=0; i<arraylength; i++) {
                randomArray[i] = rand.nextInt(n )+k;
                System.out.print(randomArray[i] + " "); }
             int j = 0; // счетчик вхождения числа -1 в массив
            int l = 0; //счетчик вхождения числа 0 в массив
            int m = 0; // счетчик вхождения числа 1 в массив
            int[] elementuMassiva = {-1, 0, 1};
            for (i=0; i<11; i++) {
                if (randomArray[i] == elementuMassiva[0]) {
                        j++;
                }
                if (randomArray[i] == elementuMassiva[1]) {
                      l++;
                }
                if (randomArray[i] == elementuMassiva[2]) {
                    m++;
                }
            }
            System.out.println();
            if ((j>k) && (j>m)) {
                System.out.println("Наиболее часто ( " + j + "раз ) встречается элемент " + elementuMassiva[0] );
            }
            if ((l>j) && (l>m)) {
                System.out.println("Наиболее часто ( " + l + "раз ) встречается элемент " + elementuMassiva[1] );
            }
            if ((m>j) && (m>l)) {
                System.out.println("Наиболее часто ( " + m + "раз ) встречается элемент " + elementuMassiva[2] );
            }
            else;
            }
        }





