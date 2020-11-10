package com.company;

import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String str = src.nextLine();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                count++;
            }
        }
        if (count == str.length()) {
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not pallindrome");
        }
    }
}
