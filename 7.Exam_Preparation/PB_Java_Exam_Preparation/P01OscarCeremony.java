package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P01OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double figures = rent * 0.7;
        double food = figures * 0.85;
        double sound = food / 2;

        System.out.printf("%.2f", rent + figures + food+ sound);
    }
}
