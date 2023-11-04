package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilogramsFood = Integer.parseInt(scanner.nextLine());

        int gramsFood = kilogramsFood * 1000;
        int gramsEatenTotal = 0;

        String eatenFood = scanner.nextLine();
        while (!eatenFood.equals("Adopted")) {
            int gramsEaten = Integer.parseInt(eatenFood);
            gramsEatenTotal += gramsEaten;

            eatenFood = scanner.nextLine();
        }

        if (gramsFood - gramsEatenTotal >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.", Math.abs(gramsFood - gramsEatenTotal));
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(gramsFood - gramsEatenTotal));
        }
    }
}
