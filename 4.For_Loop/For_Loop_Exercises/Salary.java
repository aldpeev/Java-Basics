package For_Loop_Exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        int penalty = 0;
        for (int i = 0; i < n; i++) {
            String sites = scanner.nextLine();

            switch (sites) {
                case "Facebook":
                    penalty += 150;
                    break;
                case "Instagram":
                    penalty += 100;
                    break;
                case "Reddit":
                    penalty += 50;
                    break;
            }

            if (salary <= penalty) {
                System.out.println("You have lost your salary.");
                break;
            }
        }

        if (salary - penalty > 0){
            System.out.println(salary - penalty);
        }
    }
}
