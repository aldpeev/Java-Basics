package FirstSteps_Exercises;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class VacationBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfPages = Integer.parseInt(scanner.nextLine());
        int donePagesFor1Hr = Integer.parseInt(scanner.nextLine());
        int daysToBeReady = Integer.parseInt(scanner.nextLine());

        int timeToFinishBook = numOfPages/donePagesFor1Hr;

        int hrsToRead = timeToFinishBook/ daysToBeReady;

        System.out.println(hrsToRead);


    }
}
