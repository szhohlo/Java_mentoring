package com.epam.mentoring;

public class EvenArray {
    public static void main(String[] args) {

        int i = 0;
        for (int element = 2; element <= 20; element++) {
            if (element % 2 == 0) i++;
        }


        int[] array = new int[i];
        int b = 0;
        for (int element = 2; element <= 20; element++) {
            if (element % 2 == 0) {
                array[b] = element;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println();
        System.out.println("Массив в столбец");
        b = 0;
        for (int element = 2; element <= 20; element++) {
            if (element % 2 == 0) {
                array[b] = element;
                System.out.println(array[b]);
                b++;
            }
        }
    }
}




