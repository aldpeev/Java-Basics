package FirstSteps_Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());

        double priceOfOrder = chickenMenu * 10.35 + fishMenu * 12.40 + veganMenu * 8.15;
        double desert = priceOfOrder * 0.2;

        System.out.println( priceOfOrder + desert + 2.5);
    }
}
