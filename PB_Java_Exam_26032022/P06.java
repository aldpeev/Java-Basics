package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < locations; i++) {
            double expectedGold = Double.parseDouble(scanner.nextLine());

            double goldPerDay = 0;

            int daysGold = Integer.parseInt(scanner.nextLine());
            for (int j = 0; j < daysGold; j++) {
                goldPerDay += Double.parseDouble(scanner.nextLine());
            }

            double averageGold = goldPerDay / daysGold;
            if (averageGold >= expectedGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.%n", expectedGold - averageGold);
            }

        }
    }
}
