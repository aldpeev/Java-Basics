package PB_Java_Exam_Preparation_2;

import java.util.Scanner;

public class P01BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cake = rent * 0.2;
        double drinks = cake * 0.55;
        double clown = rent / 3;

        System.out.printf("%.2f", rent + cake + drinks + clown);


    }
}
