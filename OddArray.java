package com.epam.mentoring;

public class OddArray {
    public static void main(String[] args) {
        int i=0;
        for (int element1 = 1; element1 <=99; element1++) {
            if (element1 %2 != 0) i++;
        }


        int arrayOdd[] = new int[i];
        int a=0;
        for (int element1 = 1; element1 <=99; element1++) {
            if ( element1 % 2 !=0) {
                arrayOdd[a] = element1;
                System.out.print(arrayOdd[a] + " ");
                a++;
            }
        }

        System.out.println();
        a=arrayOdd.length-1;
        for (int element1 =99; element1 >0; element1--) {
            if ( element1 % 2 !=0) {
                arrayOdd[a] = element1;
                System.out.print(arrayOdd[a] + " ");
                a--;
            }
        }
    }
}
