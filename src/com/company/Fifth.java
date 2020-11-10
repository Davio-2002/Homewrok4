package com.company;

import java.util.Random;

public class Fifth {
    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[10];
        int[] copyArr = new int[10];

        System.out.print("Original array : ");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            copyArr[i] = myArr[i];

            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.print("Copied array : ");
        for (int j : copyArr) {
            System.out.print(j + " ");
        }
    }
}
