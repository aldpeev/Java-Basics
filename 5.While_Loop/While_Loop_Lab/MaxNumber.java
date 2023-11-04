package While_Loop_Lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int max = Integer.MIN_VALUE;
        while (!command.equals("Stop")){
            int num = Integer.parseInt(command);

            if (num > max){
                max = num;
            }

            command = scanner.nextLine();
        }
        System.out.println(max);
    }
}
