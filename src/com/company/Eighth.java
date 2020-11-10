package com.company;

public class Eighth {
    public static void main(String[] args) {
        String[] firstNames = {"Artur", "Tigran", "Albert", "Levon", "David", "Robert", "Noi"};
        String[] secondNames = {"Gevorg", "Garegin", "Noi", "Robert", "Andranik", "Albert", "Tigran"};

        for (String firstName : firstNames) {
            for (String secondName : secondNames) {
                if (firstName.equals(secondName)) {
                    System.out.println(secondName);
                }
            }
        }
    }
}
