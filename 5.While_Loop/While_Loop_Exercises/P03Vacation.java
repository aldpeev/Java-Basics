package While_Loop_Exercises;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int spendingDays = 0;
        int allPassedDays = 0;
        boolean isTooMuchSpending = false;

        while (money < moneyNeeded) {
            String command = scanner.nextLine();
            double moneyCommand = Double.parseDouble(scanner.nextLine());
            allPassedDays++;

            if (command.equals("spend")) {
                spendingDays++;
                money -= moneyCommand;
                if ( money <= 0){
                    money = 0;
                }
            } else if (command.equals("save")) {
                spendingDays = 0;
                money += moneyCommand;
            }

            if (spendingDays == 5) {
                isTooMuchSpending = true;
                break;
            }
        }

        if (isTooMuchSpending) {
            System.out.printf("You can't save the money.%n%d", allPassedDays);
        } else {
            System.out.printf("You saved the money for %d days.", allPassedDays);
        }
    }
}
