package For_Loop_Lab;

import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= num; i++){
            int numForSum = Integer.parseInt(scanner.nextLine());
            sum += numForSum;
        }

        System.out.println(sum);
    }
}
