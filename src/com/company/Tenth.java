package com.company;

import java.util.Random;

public class Tenth {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[10];

        int max = myArr[0];
        int secMax = myArr[0];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }

        System.out.println();

        for (int j : myArr) {
            if (j > max) {
                secMax = max;
                max = j;
            } else if (j > secMax) {
                secMax = j;
            }
        }
        System.out.println("Second largest number is " + secMax);
    }
}
