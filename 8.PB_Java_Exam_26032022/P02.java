package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double heightAstronauts = Double.parseDouble(scanner.nextLine());

        double volumeShip = width * length * height;
        double volumeRoom = (heightAstronauts + 0.4) * 2 * 2;
        double result = Math.floor(volumeShip / volumeRoom);

        if (result >= 3 && result <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.%n",result);
        } else if ( result < 3){
            System.out.println("The spacecraft is too small.");
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
