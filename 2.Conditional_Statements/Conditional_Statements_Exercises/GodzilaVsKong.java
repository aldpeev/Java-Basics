package Conditional_Statements_Exercises;

import java.util.Scanner;

public class GodzilaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int staticActors = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        if (staticActors > 150) {
            priceClothes = priceClothes - (priceClothes * 0.1);
        }

        double sumClothes = staticActors * priceClothes;
        double sumExpenses = decor + sumClothes;

        double result = Math.abs(budget - sumExpenses);

        if (budget >= sumExpenses) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", result);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", result);
        }

    }
}
