package For_Loop_Lab;

import java.util.Scanner;

public class NumSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < num; i++) {
            int numsToRead = Integer.parseInt(scanner.nextLine());

            if (numsToRead < minNum){
                minNum = numsToRead;
            }
            if (numsToRead > maxNum){
                maxNum = numsToRead;
            }
        }

        System.out.printf("Max number: %d%n",maxNum);
        System.out.printf("Min number: %d",minNum);
    }
}
