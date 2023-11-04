package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = end; i >= start; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == s){
                    break;
                }
                System.out.print(i + " ");
            }

        }
    }
}
