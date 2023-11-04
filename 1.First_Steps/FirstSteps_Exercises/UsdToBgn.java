package FirstSteps_Exercises;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lev = Double.parseDouble(scanner.nextLine());
        double usd = lev * 1.79549;

        System.out.println(usd);
    }
}
