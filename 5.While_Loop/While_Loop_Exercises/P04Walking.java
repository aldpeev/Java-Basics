package While_Loop_Exercises;

import java.util.Scanner;

public class P04Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = 0;
        while (steps <= 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")){
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }

            steps += Integer.parseInt(input);
        }


        if (steps >= 10000) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", steps - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - steps);
        }
    }
}
