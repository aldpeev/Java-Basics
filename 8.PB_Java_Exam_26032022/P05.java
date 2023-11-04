package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = 0;
        int kids = 0;

        String command = scanner.nextLine();
        while (!command.equals("Christmas")){
            int age = Integer.parseInt(command);
            if (age <= 16){
                kids ++;
            } else {
                adults ++;
            }
            command = scanner.nextLine();
        }

        System.out.printf("Number of adults: %d%n", adults);
        System.out.printf("Number of kids: %d%n",kids);
        System.out.printf("Money for toys: %d%n", kids * 5);
        System.out.printf("Money for sweaters: %d%n", adults * 15);
    }
}
