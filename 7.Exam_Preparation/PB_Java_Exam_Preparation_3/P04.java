package PB_Java_Exam_Preparation_3;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int r = 0;
        int o = 0;
        int y = 0;
        int w = 0;
        int divided = 0;
        int others = 0;

        double points = 0;
        for (int i = 0; i < n; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    points += 5;
                    r++;
                    break;
                case "orange":
                    points += 10;
                    o++;
                    break;
                case "yellow":
                    points += 15;
                    y++;
                    break;
                case "white":
                    points += 20;
                    w++;
                    break;
                case "black":
                    points = Math.floor(points / 2);
                    divided++;
                    break;
                default:
                    others++;
                    break;
            }
        }

        System.out.printf("Total points: %.0f%n", points);
        System.out.printf("Red balls: %d%n", r);
        System.out.printf("Orange balls: %d%n", o);
        System.out.printf("Yellow balls: %d%n", y);
        System.out.printf("White balls: %d%n", w);
        System.out.printf("Other colors picked: %d%n", others);
        System.out.printf("Divides from black balls: %d%n", divided);
    }
}
