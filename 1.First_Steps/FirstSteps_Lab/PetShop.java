package FirstSteps_Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());

        double priceDogsFood = dogsFood * 2.5;
        double priceCatsFood = catsFood * 4;

        double result = priceCatsFood + priceDogsFood;

        System.out.printf("%f lv.", result);
    }
}
