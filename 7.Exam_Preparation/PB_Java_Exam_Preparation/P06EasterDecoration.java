package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P06EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double averageBill = 0;

        int clients = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < clients; i++) {

            int count = 0;
            double bill = 0;

            String order = scanner.nextLine();
            while (!order.equals("Finish")){
                switch (order) {
                    case "basket":
                        bill += 1.5;
                        break;
                    case "wreath":
                        bill += 3.8;
                        break;
                    case "chocolate bunny":
                        bill += 7;
                        break;
                }
                count ++;
                order = scanner.nextLine();
            }
            if (count % 2 == 0){
                bill -= bill * 0.2;
            }
            averageBill += bill;

            System.out.printf("You purchased %d items for %.2f leva.%n", count, bill);
        }
        System.out.printf("Average bill per client is: %.2f leva.", averageBill / clients);
    }
}
