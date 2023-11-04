package While_Loop_Exercises;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int n = width * height;

        while (n > 0) {
            String command = scanner.nextLine();

            if (command.equals("STOP")) {
                break;
            }

            n -= Integer.parseInt(command);
        }

        if (n < 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(n));
        } else {
            System.out.printf("%d pieces are left.", n);
        }


    }
}
