package FirstSteps_Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int metersNylon = Integer.parseInt(scanner.nextLine());
        int litersPaint = Integer.parseInt(scanner.nextLine());
        int litersThinner = Integer.parseInt(scanner.nextLine());
        int hoursWorking = Integer.parseInt(scanner.nextLine());
        double litersPaint10Procent = (litersPaint * 14.50) * 0.1;

        double costsOfMaterials = metersNylon * 1.5 + litersPaint * 14.50 + litersPaint10Procent + litersThinner * 5 + 3.40;
        double costsOfWorkmanOneHour = costsOfMaterials * 0.3;

        double finalPrice = costsOfMaterials + costsOfWorkmanOneHour * hoursWorking;

        System.out.println(finalPrice);
    }
}
