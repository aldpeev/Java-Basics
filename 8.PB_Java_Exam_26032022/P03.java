package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        ;
        String gender = scanner.nextLine();

        double age = 0;
        boolean isInvalid = false;

        switch (breed) {
            case "British Shorthair":
                if (gender.equals("m")) {
                    age = 13;
                } else {
                    age = 14;
                }
                break;
            case "Siamese":
                if (gender.equals("m")) {
                    age = 15;
                } else {
                    age = 16;
                }
                break;
            case "Persian":
                if (gender.equals("m")) {
                    age = 14;
                } else {
                    age = 15;
                }
                break;
            case "Ragdoll":
                if (gender.equals("m")) {
                    age = 16;
                } else {
                    age = 17;
                }
                break;
            case "American Shorthair":
                if (gender.equals("m")) {
                    age = 12;
                } else {
                    age = 13;
                }
                break;
            case "Siberian":
                if (gender.equals("m")) {
                    age = 11;
                } else {
                    age = 12;
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", breed);
                isInvalid = true;
                break;
        }

        if (!isInvalid) {
            System.out.printf("%.0f cat months", Math.floor((age * 12) / 6));
        }
    }
}
