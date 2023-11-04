package For_Loop_Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        int moneyLily = 0;
        double moneyBrother = 0.0;

        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 == 0) {
                moneyLily += 5 * i;
                moneyBrother ++;
            } else {
                countToys ++;
            }
        }

        double budget = ((moneyLily + (countToys * priceToy)) - moneyBrother) ;
        if (budget >= washingMachinePrice){
            System.out.printf("Yes! %.2f", budget - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", Math.abs(washingMachinePrice - budget));
        }

    }
}
