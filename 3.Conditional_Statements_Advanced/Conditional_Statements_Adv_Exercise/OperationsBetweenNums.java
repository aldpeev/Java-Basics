package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class OperationsBetweenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operationSymbol = scanner.nextLine();

        double result = 0.0;
        String evenOrOdd = "";


        switch (operationSymbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
        }

        if (operationSymbol.equals("+") || operationSymbol.equals("-") || operationSymbol.equals("*")) {
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", num1, operationSymbol, num2, result, evenOrOdd);
        } else if (operationSymbol.equals("/")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            }else{
                result = num1 * 1.0 / num2;
                System.out.printf("%d / %d = %.2f", num1, num2, result);
            }
        } else if (operationSymbol.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            }else{
                result = num1 % num2;
                System.out.printf("%d %% %d = %.0f", num1, num2, result);
            }
        }

    }
}
