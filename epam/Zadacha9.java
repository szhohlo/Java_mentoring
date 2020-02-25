package com.epam.mentoring;

 /* Условие :
 9.	Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
 Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива
  с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве. */

import java.text.DecimalFormat;
import java.util.Random;

public class Zadacha9 {
    public void run() {
        Random rand = new Random();
        Random rand1 = new Random();
        int randomArray1[] = new int[10];
        int randomArray2[] = new int[10];
        double calculationArray[] = new double[10];
        int i;
        for (i = 0; i < randomArray1.length; i++) {
            randomArray1[i] = rand.nextInt(9) +1;
            System.out.print(randomArray1[i] + " ");
        }

        System.out.println();

        for (i = 0; i < randomArray2.length; i++) {
            randomArray2[i] = rand1.nextInt(9) +1;
            System.out.print(randomArray2[i]+ " ");
        }
        System.out.println();

        DecimalFormat df = new DecimalFormat("#.###");
        for (i = 0; i < randomArray1.length; i++) {
            calculationArray[i] = (double)randomArray1[i]/randomArray2[i];
            System.out.print(df.format(calculationArray[i]) + "   ");
        }

        int counerCeluhChisel = 0;
        for (i = 0; i < randomArray1.length; i++) {
            if (calculationArray[i] - Math.floor(calculationArray[i]) ==0) counerCeluhChisel++;
        }
        System.out.println();
        System.out.println("Количество целых чисел в массиве: " + counerCeluhChisel);
    }

}