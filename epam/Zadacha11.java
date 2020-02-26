/* 11.	Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и сообщить
пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти суммы модулей равны.
Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.  */

package com.epam.mentoring.epam;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Zadacha11 {
    public static void main(String[] args) {
        int a;
        int left = 0;
        int right = 0;
        int i;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите целое четное число");
        //Проверим, является ли символ, введенный пользователем, числом
        if (scn.hasNextInt()) {
            //Если введено число, проверим является ли число четным, если нет - попросим повторить ввод
            do {
                a = scn.nextInt();
                if ((a % 2 != 0) || (a < 1)) System.out.println("Вы ошиблись, введите четное число!");
            }
            while (a % 2 != 0 || a < 1);
            {
                System.out.println("Спасибо");
            }

            Random rand = new Random();
            int[] randArray = new int[a];
            for (i = 0; i < randArray.length; i++) {
                randArray[i] = rand.nextInt(11) - 5;
                System.out.print(randArray[i] + " ");

                if (i < randArray.length / 2) {
                    left += Math.abs(randArray[i]);
                } else {
                    right += Math.abs(randArray[i - 1]);
                }
            }
            System.out.println();
                if (left > right) System.out.println("Сумма модулей левой части массива больше");
                if (left < right) System.out.println("Сумма модулей правой части массива больше");
                if (left == right) System.out.println("Сумма модулей левой и правой части массивов равны");
            }
        else System.out.println("Вы не выполнили условие - Введено не число либо дробное число. ");
        }
    }
