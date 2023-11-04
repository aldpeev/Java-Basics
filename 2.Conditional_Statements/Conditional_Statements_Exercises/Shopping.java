package Conditional_Statements_Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int proccessors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double priceVideocards = (videocards * 250);
        double priceConfig = priceVideocards + (proccessors * (priceVideocards * 0.35)) + (ramMemory * (priceVideocards * 0.1));

        if (videocards > proccessors) {
            priceConfig = priceConfig - (priceConfig * 0.15);
        }

        double money = Math.abs(budget - priceConfig);
        if (budget >= priceConfig) {
            System.out.printf("You have %.2f leva left!", money);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", money);
        }

    }
}
