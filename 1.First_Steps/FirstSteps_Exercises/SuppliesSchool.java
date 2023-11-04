package FirstSteps_Exercises;

import java.util.Scanner;

public class SuppliesSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packsOfPencils = Integer.parseInt(scanner.nextLine());
        int packsOfMarkers = Integer.parseInt(scanner.nextLine());
        int litresOfCleaningFluid = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double priceOrder = packsOfPencils * 5.80 + packsOfMarkers * 7.20 + litresOfCleaningFluid * 1.20;

        double priceWithDiscount = priceOrder * discount / 100 ;

        double finalPrice = priceOrder - priceWithDiscount;

        System.out.println(finalPrice);
    }
}
