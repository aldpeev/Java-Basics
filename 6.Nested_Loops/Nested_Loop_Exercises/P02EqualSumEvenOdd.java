package Nested_Loop_Exercises;

import java.util.Scanner;

public class P02EqualSumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2 ; i++) {

            int sumEven = 0;
            int sumOdd = 0;

            String currentNumString = String.valueOf(i);
            for (int j = 0; j < currentNumString.length(); j++) {
                int currentNumInt = Character.getNumericValue(currentNumString.charAt(j));

                if (j % 2 == 0){
                    sumEven += currentNumInt;
                } else {
                    sumOdd += currentNumInt;
                }
            }
            if (sumEven == sumOdd){
                System.out.print(currentNumString + " ");
            }

        }

    }
}
