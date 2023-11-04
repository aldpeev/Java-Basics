package FirstSteps_Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double depositSum = Double.parseDouble(scanner.nextLine());
        int intervalIntrest = Integer.parseInt(scanner.nextLine());
        double intrestRate = Double.parseDouble(scanner.nextLine());

        double result = depositSum + intervalIntrest * ((depositSum * (intrestRate / 100)) / 12);

        System.out.println(result);

    }
}
