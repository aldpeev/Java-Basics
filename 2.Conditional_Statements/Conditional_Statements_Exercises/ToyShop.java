package Conditional_Statements_Exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int numberOfToys = puzzles + dolls + bears + minions + trucks;

        double sumOfOrder = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);

        if (numberOfToys >= 50) {
            sumOfOrder = sumOfOrder - (sumOfOrder * 0.25);
        }

        double rent = sumOfOrder * 0.1;
        double netProfit = sumOfOrder - rent;

        double diff = Math.abs(netProfit - holidayPrice);
        if (netProfit >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }

    }
}
