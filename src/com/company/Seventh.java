package com.company;

import java.util.Random;

public class Seventh {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[20];

        for (int i = 0; i < myArr.length; ++i) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.print("Duplicate elements are: ");
        for (int i = 0; i < myArr.length; ++i) {
            for (int j = i + 1; j < myArr.length; ++j) {
                if (myArr[i] == myArr[j]) {
                    System.out.print(myArr[j] + " ");
                    break;
                }
            }
        }
    }
}
