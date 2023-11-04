package FirstSteps_Exercises;

import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int priceYear = Integer.parseInt(scanner.nextLine());

        double shoes = priceYear - priceYear * 0.4;
        double trainingCostume = shoes - shoes * 0.2;
        double ball = trainingCostume / 4;
        double accessoaries = ball / 5;

        System.out.println( priceYear + shoes + trainingCostume + ball + accessoaries);
    }
}
