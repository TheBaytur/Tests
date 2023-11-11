package com.company;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // x /2 = 50%
        // 50% *5 /100 = 5%

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        int pytdesyateProcentovGodovyh = x / 2;


        int pyateProcentBonus = procent(pytdesyateProcentovGodovyh, 5);

        System.out.println(pyateProcentBonus);

        int vosemProcentovBonus = procent(x, 30) * 8 / 100;

        int desyateProcentovBonus = procent(x, 20) * 10 / 100;

        System.out.println("Сумма годовой зарплаты с бонусами: " + (pyateProcentBonus + vosemProcentovBonus + desyateProcentovBonus + x));
    }


    public static int procent(int x, int procent) {
        return x * procent / 100;
    }




}
