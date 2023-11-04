package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int cows = Integer.parseInt(scanner.nextLine());
        int rows = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (projection.equals("Premiere")) {
            price = 12.0;
        } else if (projection.equals("Normal")) {
            price = 7.5;
        } else if (projection.equals("Discount")){
            price = 5.0;
        }

        System.out.printf("%.2f",(price * cows * rows));
    }
}
