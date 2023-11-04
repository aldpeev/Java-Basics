package Conditional_Statements_Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int lenghtMovie = Integer.parseInt(scanner.nextLine());
        int lenghtBreak = Integer.parseInt(scanner.nextLine());

        double timeOtherActivities = (lenghtBreak / 8.0) + (lenghtBreak / 4.0);

        double freeTimeWatching = lenghtBreak - timeOtherActivities;

        double time = Math.abs(lenghtMovie - freeTimeWatching);
        if (lenghtMovie <= freeTimeWatching) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movie, Math.ceil(time));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movie, Math.ceil(time));
        }
    }
}
