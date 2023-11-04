package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String pack = scanner.nextLine();
        int sets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double finalPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (pack.equals("small")) {
                    price = 2 * 56;
                } else {
                    price = 5 * 28.70;
                }
                break;
            case "Mango":
                if (pack.equals("small")) {
                    price = 2 * 36.66;
                } else {
                    price = 5 * 19.60;
                }
                break;
            case "Pineapple":
                if (pack.equals("small")) {
                    price = 2 * 42.10;
                } else {
                    price = 5 * 24.80;
                }
                break;
            case "Raspberry":
                if (pack.equals("small")) {
                    price = 2 * 20;
                } else {
                    price = 5 * 15.20;
                }
                break;
        }

        finalPrice = price * sets;

        if (finalPrice >= 400 && finalPrice <= 1000){
            finalPrice = finalPrice - finalPrice * 0.15;
        } else if (finalPrice > 1000){
            finalPrice = finalPrice - finalPrice * 0.5;
        }

        System.out.printf("%.2f lv.", finalPrice);
    }
}
