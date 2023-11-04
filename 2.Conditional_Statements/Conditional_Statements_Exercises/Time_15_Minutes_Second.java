package Conditional_Statements_Exercises;

import java.util.Scanner;

public class Time_15_Minutes_Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int minParse = (hour * 60) + min + 15 ;

        int newHour = minParse / 60;
        int newMinutes = minParse % 60;

        if (newHour > 23){
            newHour = 0;
            System.out.printf("%d:%02d", newHour, newMinutes);
        } else {
            System.out.printf("%d:%02d", newHour, newMinutes);
        }


    }
}
