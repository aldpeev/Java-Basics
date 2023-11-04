package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int countWalk = Integer.parseInt(scanner.nextLine());
        int caloriesCat = Integer.parseInt(scanner.nextLine());

        int timeWalking = minutesWalk * countWalk;
        int burnedCalories = timeWalking * 5;
        double neededCalories = caloriesCat * 0.5;

        if (burnedCalories >= neededCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
