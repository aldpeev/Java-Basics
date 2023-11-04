package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class SummerClothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";
        if (time.equals("Morning")) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (celsius <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (time.equals("Afternoon")) {
            if (celsius >= 10 && celsius <= 18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (celsius <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else {
            outfit = "Shirt";
            shoes = "Moccasins";
        }

        System.out.printf("It's %d degrees, get your %s and %s.", celsius, outfit, shoes);
    }
}
