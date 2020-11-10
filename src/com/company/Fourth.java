package com.company;

import java.util.Random;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner src = new Scanner(System.in);

        int[] myArr = new int[10];
        int[] newArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }

        System.out.println();

        do {
            int num = src.nextInt();
            int temp = 0;
            for (int i = 0; i < newArr.length; i++) {
                if (myArr[i] == num) {
                    temp = myArr[i];
                } else {
                    newArr[i] = myArr[i];
                    System.out.print(newArr[i] + " ");
                }
            }

            if (num == temp) {
                break;
            }

            System.out.println();
            System.out.println("Number doesn't exist, try again");
        } while (true);
    }
}

