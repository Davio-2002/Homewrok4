package com.company;

import java.util.Random;

public class First {

    public static void main(String[] args) {
        Random random = new Random();
        int[] myArr = new int[10];
        int sum = 0;

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            sum += myArr[i];
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
