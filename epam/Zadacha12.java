/*12.	Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом,
чтобы отрицательных и положительных элементов там было поровну и не было нулей.
При этом порядок следования элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает
сначала 6 положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
Вывести полученный массив на экран. */

package com.epam.mentoring.epam;

public class Zadacha12 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int[] array = new int[12];
        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 21 - 10);
                if (array[i] > 0) a++;
                if (array[i] < 0) b++;
                if (array[i] == 0) i--;

            }
        }
        while (a != array.length/2 && b!=array.length/2);

               for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i] + " ");
               }

                       }
                          }

