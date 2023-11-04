package PB_Java_Exam_Preparation_3;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOverWeight = Double.parseDouble(scanner.nextLine());
        double luggageWeight = Double.parseDouble(scanner.nextLine());
        int daysToFlight = Integer.parseInt(scanner.nextLine());
        int numLuggage = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (luggageWeight < 10){
            price  = priceOverWeight * 0.2;
        } else if ( luggageWeight <= 20){
            price = priceOverWeight * 0.5;
        } else {
            price = priceOverWeight;
        }

        if (daysToFlight < 7){
            price += price * 0.4;
        } else if (daysToFlight <= 30){
            price += price * 0.15;
        } else {
            price += price * 0.1;
        }

        System.out.printf("The total price of bags is: %.2f lv. ", price * numLuggage);
    }
}
