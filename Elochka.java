package com.company;

public class Elochka {
    public static void main(String args[]){
        int sz = 6;

        for (int y = 1; y < sz; y++)
            System.out.print(" ");
        System.out.println("*"); // First line "*"

        for (int x = 2; x < sz; x++) {
            for (int y = 1; y <= sz - x; y++)
                System.out.print(" ");
            System.out.print("*");
            for (int y = 1; y < x * 2 - 2; y++)
                System.out.print(" ");
            System.out.println("*"); // Middle lines "*   *"
        }

        System.out.print("*");
        for (int y = 1; y < sz * 2 - 2; y++)
            System.out.print("*");
        System.out.println("*"); // Final line "*****"
    }
}
