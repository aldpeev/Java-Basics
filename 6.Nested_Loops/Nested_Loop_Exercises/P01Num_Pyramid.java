package Nested_Loop_Exercises;

import java.util.Scanner;

public class P01Num_Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        boolean isBigger = false;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
                if (num > n){
                    isBigger = true;
                    break;
                }
            }
            if (isBigger){
                break;
            }
            System.out.println("");
        }
    }
}
