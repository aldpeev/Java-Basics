package While_Loop_Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("NoMoreMoney")) {
                System.out.printf("Total: %.2f%n", sum);
                break;
            }

            double money = Double.parseDouble(command);
            if (money <= 0) {
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f%n", sum);
                break;
            }
            sum += money;
            System.out.printf("Increase: %.2f%n", money);
        }
    }
}
