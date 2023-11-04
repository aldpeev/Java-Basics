package Conditional_Statements_Exercises;

import java.util.Scanner;

public class Time_15_Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());


        int minAfter15 = min + 15;

        if (minAfter15 <= 59) {
            System.out.printf("%d:%02d", hour, minAfter15);
        } else if (hour >= 23) {
            hour = 0;
            minAfter15 = minAfter15 - 60;
            System.out.printf("%d:%02d", hour, minAfter15);
        } else if(minAfter15 >= 60){
            hour = hour + 1;
            minAfter15 = minAfter15 - 60;
            System.out.printf("%d:%02d", hour, minAfter15);
        }

    }
}