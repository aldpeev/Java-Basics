package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numOfFishers = Integer.parseInt(scanner.nextLine());

        double boatRent = 0.0;

        if (season.equals("Spring")) {
            boatRent = 3000.0;
            if (numOfFishers >= 1 && numOfFishers <= 6) {
                boatRent = boatRent - (boatRent * 0.1);
            } else if (numOfFishers <= 11) {
                boatRent = boatRent - (boatRent * 0.15);
            } else {
                boatRent = boatRent - (boatRent * 0.25);
            }
        } else if (season.equals("Summer") || season.equals("Autumn")) {
            boatRent = 4200.0;
            if (numOfFishers >= 1 && numOfFishers <= 6) {
                boatRent = boatRent - (boatRent * 0.1);
            } else if (numOfFishers <= 11) {
                boatRent = boatRent - (boatRent * 0.15);
            } else {
                boatRent = boatRent - (boatRent * 0.25);
            }
        } else if (season.equals("Winter")) {
            boatRent = 2600.0;
            if (numOfFishers >= 1 && numOfFishers <= 6) {
                boatRent = boatRent - (boatRent * 0.1);
            } else if (numOfFishers <= 11) {
                boatRent = boatRent - (boatRent * 0.15);
            } else {
                boatRent = boatRent - (boatRent * 0.25);
            }
        }

        if ((numOfFishers % 2 == 0) && (!season.equals("Autumn"))) {
            boatRent = boatRent - (boatRent * 0.05);
        }

        double diff = Math.abs(budget - boatRent);

        if (budget >= boatRent) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
