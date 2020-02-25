package com.epam.mentoring;

public class Fibonachchi {
    public static void main(String[] args) {
        int fibonArray[] = new int[20];
        fibonArray[0] = 1;
        fibonArray[1] = 1;
        int fibsum;
        System.out.print(fibonArray[0] + " " + fibonArray[1]+ " ");
        for (int i = 2; i <20; i++) {
          fibsum = fibonArray [i-1] + fibonArray[i-2];
          fibonArray[i] =  fibsum;
            System.out.print(fibonArray[i]+" ");
        }
    }
}
