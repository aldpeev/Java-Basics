package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceOneFlower = 0.0;
        double priceAllFlowers = 0.0;

        if (flower.equals("Roses")) {
            priceOneFlower = 5;
            priceAllFlowers = numOfFlowers * priceOneFlower;
            if (numOfFlowers > 80) {
                priceAllFlowers = priceAllFlowers - (priceAllFlowers * 0.1);
            }
        } else if (flower.equals("Dahlias")) {
            priceOneFlower = 3.80;
            priceAllFlowers = numOfFlowers * priceOneFlower;
            if (numOfFlowers > 90) {
                priceAllFlowers = priceAllFlowers - (priceAllFlowers * 0.15);
            }
        } else if (flower.equals("Tulips")) {
            priceOneFlower = 2.80;
            priceAllFlowers = numOfFlowers * priceOneFlower;
            if (numOfFlowers > 80) {
                priceAllFlowers = priceAllFlowers - (priceAllFlowers * 0.15);
            }
        } else if (flower.equals("Narcissus")) {
            priceOneFlower = 3.0;
            priceAllFlowers = numOfFlowers * priceOneFlower;
            if (numOfFlowers < 120) {
                priceAllFlowers = priceAllFlowers + (priceAllFlowers * 0.15);
            }
        } else if (flower.equals("Gladiolus")) {
            priceOneFlower = 2.50;
            priceAllFlowers = numOfFlowers * priceOneFlower;
            if (numOfFlowers < 80) {
                priceAllFlowers = priceAllFlowers + (priceAllFlowers * 0.2);
            }
        }

        double diff = Math.abs(budget - priceAllFlowers);
        if (budget >= priceAllFlowers) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numOfFlowers, flower, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
