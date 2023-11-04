package Nested_Loop_Exercises;

import java.util.Scanner;

public class P03SumPrimeNotPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumPrime = 0;
        int sumNonPrime = 0;

        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            boolean isPrime = false;

            int num = Integer.parseInt(command);
            if (num == 0 || num == 1) {
                sumNonPrime += num;
            }

            if (num < 0) {
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    sumNonPrime += num;
                    isPrime = true;
                    break;
                }
            }

            if (!isPrime) {
                sumPrime += num;
            }

            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", sumPrime, sumNonPrime);
    }
}
