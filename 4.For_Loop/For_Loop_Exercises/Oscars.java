package For_Loop_Exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int numRankingPeople = Integer.parseInt(scanner.nextLine());

        double bonusPoints = startingPoints;

        for (int i = 0; i < numRankingPeople; i++) {
            String nameRankingPeople = scanner.nextLine();
            double givenPoints = Double.parseDouble(scanner.nextLine());

            bonusPoints += (nameRankingPeople.length() * givenPoints) / 2;

            if (bonusPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, bonusPoints);
                break;
            }
        }

        if (bonusPoints < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, 1250.5 - bonusPoints);
        }
    }
}
