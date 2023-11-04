package Nested_Loops_Lab;

import java.util.Scanner;

public class P05Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double money = 0;
            while (budget > money) {
                money += Double.parseDouble(scanner.nextLine());
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
