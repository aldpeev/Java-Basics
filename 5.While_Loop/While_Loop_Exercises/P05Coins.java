package While_Loop_Exercises;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coinsChange = Math.round (change * 100);

        int coinsVending = 0;

        while (coinsChange > 0) {

            if (coinsChange >= 200) {
                coinsChange -= 200;
            } else if (coinsChange >= 100) {
                coinsChange -= 100;
            } else if (coinsChange >= 50) {
                coinsChange -= 50;
            } else if (coinsChange >= 20) {
                coinsChange -= 20;
            } else if (coinsChange >= 10) {
                coinsChange -= 10;
            } else if (coinsChange >= 5) {
                coinsChange -= 5;
            } else if (coinsChange >= 2) {
                coinsChange -= 2;
            } else {
                coinsChange -= 1;
            }
            coinsVending++;
        }

        System.out.println(coinsVending);

    }
}
