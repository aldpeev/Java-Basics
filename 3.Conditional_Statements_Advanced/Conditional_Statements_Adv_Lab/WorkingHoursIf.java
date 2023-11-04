package Conditional_Statements_Adv_Lab;

import java.util.Scanner;

public class WorkingHoursIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if ((day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday") ||day.equals("Saturday")) && (hours <= 18 && hours >=10)){
            System.out.println("open");
        }else {
            System.out.println("closed");
        }
    }
}
