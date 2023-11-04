package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String holidayPlace = "";
        double moneySpend = 0.0;
        String sleepPlace = "";

        switch (season) {
            case "summer":
                sleepPlace = "Camp";
                break;
            case "winter":
                sleepPlace = "Hotel";
                break;
        }

        if (budget <= 100) {
            holidayPlace = "Bulgaria";
            if (season.equals("summer")) {
                moneySpend = budget * 0.3;
            } else if (season.equals("winter")) {
                moneySpend = budget * 0.7;
            }
        } else if (budget <= 1000) {
            holidayPlace = "Balkans";
            if (season.equals("summer")) {
                moneySpend = budget * 0.4;
            } else if (season.equals("winter")) {
                moneySpend = budget * 0.8;
            }
        } else {
            holidayPlace = "Europe";
            moneySpend = budget * 0.9;
            sleepPlace = "Hotel";
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", holidayPlace, sleepPlace,moneySpend );

    }
}
