package Conditional_Statements_Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSportsmanSeconds = Integer.parseInt(scanner.nextLine());
        int secondSportsmanSeconds = Integer.parseInt(scanner.nextLine());
        int thirdSportsmanSeconds = Integer.parseInt(scanner.nextLine());

        int totalTime = firstSportsmanSeconds + secondSportsmanSeconds + thirdSportsmanSeconds;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        }else{
            System.out.printf("%d:%d",minutes, seconds);
        }

    }
}
