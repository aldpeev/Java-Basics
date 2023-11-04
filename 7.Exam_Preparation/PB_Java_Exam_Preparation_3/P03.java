package PB_Java_Exam_Preparation_3;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWindows = Integer.parseInt(scanner.nextLine());
        String typeOfWindows = scanner.nextLine();
        String delivery = scanner.nextLine();

        boolean isInvalid = false;
        double price = 0;
        switch (typeOfWindows) {
            case "90X130":
                if (numWindows < 10) {
                    isInvalid = true;
                } else if (numWindows < 30) {
                    price = 110 * numWindows;
                } else if (numWindows < 60) {
                    price = (110 * numWindows) * 0.95;
                } else if (numWindows > 60) {
                    price = (110 * numWindows) * 0.92;
                }
                break;
            case "100X150":
                if (numWindows < 10) {
                    isInvalid = true;
                } else if (numWindows < 40) {
                    price = 140 * numWindows;
                } else if (numWindows < 80) {
                    price = (140 * numWindows) * 0.94;
                } else if (numWindows > 80) {
                    price = (140 * numWindows) * 0.90;
                }
                break;
            case "130X180":
                if (numWindows < 10) {
                    isInvalid = true;
                } else if (numWindows < 20) {
                    price = 190 * numWindows;
                } else if (numWindows < 50) {
                    price = (190 * numWindows) * 0.93;
                } else if (numWindows > 50) {
                    price = (190 * numWindows) * 0.88;
                }
                break;
            case "200X300":
                if (numWindows < 10) {
                    isInvalid = true;
                } else if (numWindows < 25) {
                    price = 250 * numWindows;
                } else if (numWindows < 50) {
                    price = (250 * numWindows) * 0.91;
                } else if (numWindows > 50) {
                    price = (250 * numWindows) * 0.86;
                }
                break;
        }
        if (delivery.equals("With delivery")) {
            price += 60;
        }

        if (numWindows > 99) {
            price *= 0.96;
        }

        if (!isInvalid) {
            System.out.printf("%.2f BGN", price);
        } else {
            System.out.println("Invalid order");
        }
    }
}
