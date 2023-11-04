package Conditional_Statements_Adv_Lab;

import java.util.Scanner;

public class InvalidNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        boolean isValid = (num <= 200 && num >= 100) || (num == 0);

        if (!isValid){
            System.out.println("invalid");
        }
    }
}
