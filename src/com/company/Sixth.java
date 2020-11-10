package com.company;

import java.util.Random;

public class Sixth {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        int min = myArr[0];

        for (int j : myArr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Min is: " + min);
    }
}
