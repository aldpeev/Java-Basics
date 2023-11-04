package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P03EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        int price = 0;

        if (destination.equals("Germany")) {
            if (dates.equals("21-23")) {
                price = 32;
            } else if (dates.equals("24-27")) {
                price = 37;
            } else {
                price = 43;
            }
        } else if (destination.equals("France")) {
            if (dates.equals("21-23")) {
                price = 30;
            } else if (dates.equals("24-27")) {
                price = 35;
            } else {
                price = 40;
            }
        } else {
            if (dates.equals("21-23")) {
                price = 28;
            } else if (dates.equals("24-27")) {
                price = 32;
            } else {
                price = 39;
            }
        }

        System.out.printf("Easter trip to %s : %.2f leva.", destination, days * price * 1.0);
    }
}
