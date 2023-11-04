package Nested_Loops_Lab;

import java.util.Scanner;

public class P04SumOfTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());

        boolean flag = false;
        int combinations = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combinations++;
                if (i + j == sum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)",combinations, i, j, sum);
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }

        if (!flag){
            System.out.printf("%d combinations - neither equals %d", combinations, sum);
        }
    }
}
