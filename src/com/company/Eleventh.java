package com.company;

import java.util.Random;

public class Eleventh {
    public static void main(String[] args) {

        // In my homework I used bubble sort

        Random random = new Random();
        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }

        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int j : myArr) {
            System.out.print(j + " ");
        }
    }
}
