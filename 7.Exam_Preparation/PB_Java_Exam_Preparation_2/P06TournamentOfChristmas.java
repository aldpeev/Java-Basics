package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyRaisedTotal = 0;
        int winningDays = 0;
        int loosingDays = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            double moneyRaised = 0;
            int countWin = 0;
            int countLose = 0;

            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();
                switch (result) {
                    case "win":
                        moneyRaised += 20;
                        countWin++;
                        break;
                    case "lose":
                        countLose++;
                        break;
                }

                sport = scanner.nextLine();
            }
            if (countWin > countLose) {
                moneyRaised = moneyRaised + moneyRaised * 0.1;
                winningDays++;
            } else {
                loosingDays++;
            }

            moneyRaisedTotal += moneyRaised;
        }

        if (winningDays > loosingDays) {
            moneyRaisedTotal = moneyRaisedTotal + moneyRaisedTotal * 0.2;
            System.out.printf("You won the tournament! Total raised money: %.2f%n", moneyRaisedTotal);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f%n", moneyRaisedTotal);
        }
    }
}
