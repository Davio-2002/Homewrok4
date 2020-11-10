package com.company;

import java.util.Random;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner src = new Scanner(System.in);

        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(99) + 1;
            System.out.print(myArr[i] + " ");
        }

        System.out.println();

        do {
            int num = src.nextInt();
            int temp = 0;
            for (int i = 0; i < myArr.length; ++i) {
                if (num == myArr[i]) {
                    temp = myArr[i];
                    System.out.println("Index is " + i);
                    break;
                }
            }
            if (num == temp) {
                break;
            }
            System.out.println("Wrong number, try again: ");
        } while(true);
    }
}
