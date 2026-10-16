package com.pluralsight;

import java.util.*;

public class SandwichCashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of sandwich(1 or 2) ? ");
        int sandwichSize = scanner.nextInt();
        scanner.nextLine();

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

        System.out.print("\n---");
        System.out.print("\nloaded(yes/no)? ");
        String loaded = scanner.nextLine();

        double extraCost = 0;
        if (loaded.equals("yes") && sandwichSize == 1) {
            extraCost = 1.00;
            System.out.print("$1.00 addon");
        } else if (loaded.equals("yes") && sandwichSize == 2) {
            extraCost = 1.75;
            System.out.print("$1.75 addon");
        } else {
            System.out.print("no addons");
            extraCost = 0;
        }

        System.out.print("\n---");
        System.out.print("\nHow old are you? ");
        int age = scanner.nextInt();

        double discount = 0;
        if (age <= 17) {
            discount = 0.1;
            System.out.print("10% discount applied!");
        } else if (age >= 65) {
            discount = 0.2;
            System.out.print("20% discount applied!");
        } else {
            discount = 0;
            System.out.print("No discount");
        }

        double subtotal = price + extraCost;
        double total = subtotal - (subtotal * discount);

        System.out.print("\n---");
        System.out.println("\n       ~~~Total~~~");
        System.out.printf("Cost of sandwich is $%.2f", total);
        System.out.print("\n");
    }
}
