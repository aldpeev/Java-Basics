package PB_Java_Exam_Preparation_3;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameAir = scanner.nextLine();
        int ticketsAdults = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double netPriceAdults = Double.parseDouble(scanner.nextLine());
        double priceService = Double.parseDouble(scanner.nextLine());

        double netPriceKids = netPriceAdults * 0.3;

        double price = (ticketsKids * (netPriceKids + priceService)) + (ticketsAdults * (netPriceAdults + priceService));

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",nameAir, price * 0.2);
    }
}
