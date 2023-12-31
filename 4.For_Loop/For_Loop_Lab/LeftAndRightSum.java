package For_Loop_Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < n; i++) {
            int sumNum = Integer.parseInt(scanner.nextLine());
            sumLeft += sumNum;
        }

        for (int i = 0; i < n; i++) {
            int sumNum = Integer.parseInt(scanner.nextLine());
            sumRight += sumNum;
        }

        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        }else {
            System.out.printf("No, diff = %d", Math.abs(sumLeft-sumRight));
        }
    }
}
