package FirstSteps_Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());
        double priceOfMeters = meters * 7.61;
        double discount = priceOfMeters * 0.18;
        double finalPrice = priceOfMeters - discount;

        System.out.printf("The final price is: %f lv. %nThe discount is: %f lv." , finalPrice, discount);
    }
}
