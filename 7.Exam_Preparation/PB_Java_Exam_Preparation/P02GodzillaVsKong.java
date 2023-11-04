package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeFilming = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int timeScenes = Integer.parseInt(scanner.nextLine());

        double timePreparing = timeFilming * 0.15;
        double timeShooting =  scenes * timeScenes + timePreparing;

        if (timeFilming < timeShooting){
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(timeFilming - timeShooting));
        } else {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.abs(timeFilming - timeShooting));
        }
    }
}
