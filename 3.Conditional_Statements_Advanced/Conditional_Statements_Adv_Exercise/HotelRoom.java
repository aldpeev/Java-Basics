package Conditional_Statements_Adv_Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());

        double studioPricePerNight = 0.0;
        double apartmentPricePerNight = 0.0;

        switch (month) {
            case "May":
            case "October":
                studioPricePerNight = 50 * overnights;
                apartmentPricePerNight = 65 * overnights;
                break;
            case "June":
            case "September":
                studioPricePerNight = 75.20 * overnights;
                apartmentPricePerNight = 68.70 * overnights;
                break;
            case "July":
            case "August":
                studioPricePerNight = 76 * overnights;
                apartmentPricePerNight = 77 * overnights;
                break;
        }


        if (month.equals("May") || month.equals("October")) {
            if (overnights > 14) {
                studioPricePerNight = studioPricePerNight - studioPricePerNight * 0.30;
            } else if (overnights > 7) {
                studioPricePerNight = studioPricePerNight - studioPricePerNight * 0.05;
            }
        } else if ((month.equals("June") || month.equals("September")) && overnights > 14) {
            studioPricePerNight = studioPricePerNight - studioPricePerNight * 0.20;
        }

        if (overnights > 14) {
            apartmentPricePerNight = apartmentPricePerNight - apartmentPricePerNight * 0.1;
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartmentPricePerNight, studioPricePerNight);
    }
}
