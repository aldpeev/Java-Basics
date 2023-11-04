package While_Loop_Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int min = Integer.MAX_VALUE;
        while (!command.equals("Stop")){
            int num = Integer.parseInt(command);

            if (num < min){
                min = num;
            }

            command = scanner.nextLine();
        }

        System.out.println(min);
    }
}
