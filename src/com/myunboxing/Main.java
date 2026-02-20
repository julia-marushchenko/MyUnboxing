/**
 *  Java program to demonstrate unboxing.
 */
package com.myunboxing;

/**
 *  Main class.
 */
public class Main {

    // Main method to start java program.
    public static void main(String[] args) {

        // Creating wrapped objects.
        Integer a = 100;
        Double b = 120.7643;
        Character c = 'l';
        Long d = 1234567890L;

        // Creating primitive variables.
        int x = a;
        double y = b;
        char z = c;
        long s = d;

        // Printing values to console.
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(s);

    }
}