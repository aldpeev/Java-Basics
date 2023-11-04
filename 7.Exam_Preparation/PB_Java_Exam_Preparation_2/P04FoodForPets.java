package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double foodTotal = Double.parseDouble(scanner.nextLine());

        double eatenFoodCat = 0;
        double eatenFoodDog = 0;
        double eatenBiscuits = 0;

        int passedDays = 0;

        for (int i = 1; i <= days; i++) {
            int foodCat = Integer.parseInt(scanner.nextLine());
            int foodDog = Integer.parseInt(scanner.nextLine());

            eatenFoodCat += foodCat;
            eatenFoodDog += foodDog;

            passedDays++;

            if (passedDays == 3){
                eatenBiscuits = (foodCat + foodDog) * 0.1;
                passedDays = 0;
            }
        }
        double eatenFoodPets = eatenFoodCat + eatenFoodDog;

        double percentageFoodEaten = 100 - (((foodTotal - eatenFoodPets) / foodTotal) * 100);
        double percentageFoodEatenDog = ((eatenFoodPets - eatenFoodDog) / eatenFoodPets) * 100;
        double percentageFoodEatenCat = ((eatenFoodPets - eatenFoodCat) / eatenFoodPets) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(eatenBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageFoodEaten);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageFoodEatenDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageFoodEatenCat);
    }
}
