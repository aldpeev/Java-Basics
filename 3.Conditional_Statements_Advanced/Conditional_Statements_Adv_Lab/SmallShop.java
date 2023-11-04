package Conditional_Statements_Adv_Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;
        if (city.equals("Sofia")) {
            if (product.equals("coffee")) {
                price = 0.5;
            } else if (product.equals("peanuts")) {
                price = 1.6;
            } else if (product.equals("beer")) {
                price = 1.2;
            } else if (product.equals("sweets")) {
                price = 1.45;
            } else {
                price = 0.8;
            }
        } else if (city.equals("Plovdiv")) {
            if (product.equals("coffee")) {
                price = 0.4;
            } else if (product.equals("peanuts")) {
                price = 1.5;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if (product.equals("sweets")) {
                price = 1.3;
            } else {
                price = 0.7;
            }
        } else {
            if (product.equals("coffee")) {
                price = 0.45;
            } else if (product.equals("peanuts")) {
                price = 1.55;
            } else if (product.equals("beer")) {
                price = 1.10;
            } else if (product.equals("sweets")) {
                price = 1.35;
            } else {
                price = 0.7;
            }
        }

        System.out.println(quantity*price);
    }
}
