package com.pluralsight;

import java.util.*;

public class SandwichCashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of sandwich(1 or 2) ? ");
        int sandwichSize = scanner.nextInt();

        double price = 0;
        if (sandwichSize == 1) {
            price = 5.45;
            System.out.printf("1:Regular: base price $%.2f", price);
        } else if (sandwichSize == 2) {
            price = 8.95;
            System.out.printf("2:Large: base price $%.2f", price);
        } else {
            price = 0;
            System.out.printf("size %d is not available", sandwichSize);
        }

        System.out.print("\nHow old are you? ");
        int age = scanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.2;
        } else {
            discount = 0;
        }

        double total = price - (price * discount);
        System.out.println("\n      ~~~Total~~~");
        System.out.printf("Cost of sandwich is $%.2f", total);
    }
}
