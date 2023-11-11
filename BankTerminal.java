package com.company;

import java.util.Scanner;

public class BankTerminal {

    public static void main(String[] args) {

        int[] banknotes = {1, 3, 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000};
        int[] quantities = {10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2};
        int[] quantitiesCopy = {10, 5, 5, 3, 2, 1, 2, 3, 3, 2, 0, 2};

        Scanner sc = new Scanner(System.in);

        int totalAvailable = 0;
        int desiredAmount = 0;
        int aboutToGive;

        for (int i = banknotes.length - 1; i >= 0; i--) {
            totalAvailable = totalAvailable + banknotes[i] * quantities[i];
        }
        System.out.println(totalAvailable);

        while (true) {
            System.out.println("Enter your amount");
            desiredAmount = sc.nextInt();
            aboutToGive = 0;

            if (desiredAmount <= totalAvailable) {

                for (int i = banknotes.length - 1; i >= 0; i--) {

                    if (quantities[i] != 0) {
                        aboutToGive = aboutToGive + banknotes[i];

                        if (aboutToGive > desiredAmount) {
                            aboutToGive = aboutToGive - banknotes[i];

                        } else {
                            quantities[i]--;
                            noteCounter(i, quantities, quantitiesCopy, banknotes);
                            i++;
                        }
                    }
                }

                totalAvailable = totalAvailable - aboutToGive;
                System.out.println("You got: " + aboutToGive);
                System.out.println("Available: " + totalAvailable);

                if (totalAvailable == 0) {
                    System.out.println("You are out of money");
                    break;
                }

            } else {
                System.out.println("You can get only " + totalAvailable);
            }
        }
    }

    private static void noteCounter(int i, int[] quantities, int[] quantitiesCopy, int[] banknotes) {
        int Sum = quantitiesCopy[i] - quantities[i];
        quantitiesCopy[i] = quantitiesCopy[i] - 1;
        if (Sum != 0) System.out.println("used: " + Sum + "x" + banknotes[i]);
    }
}
