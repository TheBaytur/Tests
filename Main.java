package com.company;

import com.company.db.DB;

public class Main {

    public static void main(String[] args) {

        final int count = 10;
        

        Person obj1 = new Person();
        Person obj2 = new Person();
        Person obj3 = new Person();
        obj3.getCount();
        Person.getCount();

//        Person.count = 5;
//        System.out.println(Person.count);

	DB db = new DB();

	info();
    }

    public static void info() {
        System.out.println("Hello");

    }

    public static void info(String word) {
        System.out.println(word + "!");

    }
}
