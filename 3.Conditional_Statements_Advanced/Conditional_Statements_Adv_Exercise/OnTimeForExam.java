package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int studentArrivalHour = Integer.parseInt(scanner.nextLine());
        int studentArrivalMinute = Integer.parseInt(scanner.nextLine());

        int examAllMinutes = (examHour * 60) + examMinute;
        int studentAllMinutes = (studentArrivalHour * 60) + studentArrivalMinute;

        int hoursDifference = Math.abs((examAllMinutes - studentAllMinutes) / 60);
        int minutesDifference = Math.abs((examAllMinutes - studentAllMinutes) % 60);

        if (examAllMinutes - studentAllMinutes <= 30 && examAllMinutes - studentAllMinutes > 0) {
            System.out.printf("On time%n%d minutes before the start", minutesDifference);
        } else if (examAllMinutes - studentAllMinutes == 0) {
            System.out.println("On time");
        } else if (examAllMinutes - studentAllMinutes > 31) {
            if (hoursDifference > 0) {
                System.out.printf("Early%n%d:%02d hours before the start", hoursDifference, minutesDifference);
            } else {
                System.out.printf("Early%n%d minutes before the start", minutesDifference);
            }
        } else if (examAllMinutes - studentAllMinutes < 0) {
            if (hoursDifference > 0) {
                System.out.printf("Late%n%d:%02d hours after the start", hoursDifference, minutesDifference);
            } else {
                System.out.printf("Late%n%d minutes after the start", minutesDifference);
            }
        }
    }
}
