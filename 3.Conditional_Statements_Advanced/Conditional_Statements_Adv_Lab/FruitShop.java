package Conditional_Statements_Adv_Lab;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Wednesday")
                || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday")){
            if (fruit.equals("banana")){
                price = 2.5;
            } else if (fruit.equals("apple")){
                price = 1.2;
            } else if (fruit.equals("orange")){
                price = 0.85;
            } else if (fruit.equals("grapefruit")){
                price = 1.45;
            } else if (fruit.equals("kiwi")){
                price = 2.7;
            } else if (fruit.equals("pineapple")){
                price = 5.5;
            } else if (fruit.equals("grapes")){
                price = 3.85;
            }else {
                System.out.println("error");
            }

        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")){
            if (fruit.equals("banana")){
                price = 2.7;
            } else if (fruit.equals("apple")){
                price = 1.25;
            } else if (fruit.equals("orange")){
                price = 0.9;
            } else if (fruit.equals("grapefruit")){
                price = 1.6;
            } else if (fruit.equals("kiwi")){
                price = 3.0;
            } else if (fruit.equals("pineapple")){
                price = 5.6;
            } else if (fruit.equals("grapes")){
                price = 4.20;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

        if (price != 0) {
            System.out.printf("%.2f", (price * quantity));
        }
    }
}
