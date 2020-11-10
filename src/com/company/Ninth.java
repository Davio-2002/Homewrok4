package com.company;

import java.util.Random;

public class Ninth {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[10];
        int[] newArr = new int[10];

        System.out.print("Array : ");
        for (int i = 0; i < myArr.length; ++i) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }

        System.out.println();

        System.out.print("Without duplicates : ");
        int temp = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] == myArr[j]) {
                    temp = myArr[i];
                    break;
                }
            }
            if (myArr[i] == temp) {
                continue;
            }
            newArr[i] = myArr[i];

            System.out.print(newArr[i] + " ");
        }
    }
}
