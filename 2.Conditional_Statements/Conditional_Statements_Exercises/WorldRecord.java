package Conditional_Statements_Exercises;

import java.util.Scanner;

public class WorldRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double oneMeterSec = Double.parseDouble(scanner.nextLine());

        double waterSlowing = (Math.floor((meters / 15)) * 12.5); // на всеки 15 м. с 12.5 секунди, закръгляне надолу
        double distance = meters * oneMeterSec;

        double result = distance + waterSlowing;


        double diff = Math.abs(recordSec - result);
        if (result >= recordSec){
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",result);
        }

    }
}
