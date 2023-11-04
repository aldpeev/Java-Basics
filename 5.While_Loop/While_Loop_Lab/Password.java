package While_Loop_Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        while (true) {
            String password = scanner.nextLine();

            if (password.equals(pass)) {
                System.out.printf("Welcome %s!", name);
                break;
            }

        }
    }
}
