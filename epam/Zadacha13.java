/*13.	Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из
чётных элементов первого массива, если они там есть, и вывести его на экран.
 */

package com.epam.mentoring.epam;

import java.util.Random;
import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {
        int n=0;
        int i=0;

        do {
            Scanner scn = new Scanner (System.in);
            System.out.println("Введите натуральное число больше 3 ");
                if (scn.hasNextInt())
            {
                n = scn.nextInt();
            }
        else System.out.println("Вы ввели не натуральное число" );
        }
        while ( n<=3);
        System.out.println();
        int[] array = new int[n];
        Random rand = new Random();
        for (i=0; i<array.length; i++ ) {
            array[i] = rand.nextInt(n+1);
            System.out.print(array[i] + " ");
        }
        int j=0;
        for (i=0; i<array.length; i++) {
    if (array[i]%2 ==0 && array[i] !=0)
        j++;}
        System.out.println();
        System.out.println("Количество четных элементов в массиве: " + j);
            System.out.println();
        System.out.println("Массив из четных элементов предыдущего массива: ");
            if (j>0) {
            int newArray[] = new int[j];
            int b=0;
            for (i=0; i<array.length; i++) {
                if (array[i]%2 ==0 && array[i] !=0) {
                    newArray[b] = array[i];
                    System.out.print(newArray[b] + " ");
                    b++;
                                    }
            }
            }
        }
    }









