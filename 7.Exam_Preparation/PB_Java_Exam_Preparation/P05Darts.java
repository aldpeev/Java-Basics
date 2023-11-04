package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P05Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = 301;
        int countSuccessful = 0;
        int countUnsuccessful = 0;
        boolean isWon = false;

        String player = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Retire")) {

            int points = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case "Single":
                    if (startingPoints >= points) {
                        startingPoints -= points;
                        countSuccessful++;
                    } else {
                        countUnsuccessful++;
                    }
                    break;
                case "Double":
                    if (startingPoints >= points * 2) {
                        startingPoints -= points * 2;
                        countSuccessful++;
                    } else {
                        countUnsuccessful++;
                    }
                    break;
                case "Triple":
                    if (startingPoints >= points * 3) {
                        startingPoints -= points * 3;
                        countSuccessful++;
                    } else {
                        countUnsuccessful++;
                    }
                    break;
            }
            if (startingPoints <= 0) {
                isWon = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (isWon) {
            System.out.printf("%s won the leg with %d shots.", player, countSuccessful);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, countUnsuccessful);
        }
    }
}
