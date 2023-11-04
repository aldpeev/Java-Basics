package While_Loop_Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (true) {
            int num2 = Integer.parseInt(scanner.nextLine());
            sum += num2;

            if (sum >= num) {
                System.out.println(sum);
                break;
            }
        }
    }
}