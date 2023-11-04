package For_Loop_Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0.0;
        double winner = 0.0;

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

            switch (text) {
                case "W":
                    bonusPoints += 2000;
                    winner += 1;
                    break;
                case "F":
                    bonusPoints += 1200;
                    break;
                case "SF":
                    bonusPoints += 720;
                    break;
            }
        }

        System.out.printf("Final points: %.0f%nAverage points: %.0f%n%.2f%%", points + bonusPoints, Math.floor(bonusPoints / n), (winner / n) * 100);
    }
}
