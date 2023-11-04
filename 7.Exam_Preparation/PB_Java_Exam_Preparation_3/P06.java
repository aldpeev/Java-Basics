package PB_Java_Exam_Preparation_3;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        String end = scanner.nextLine();

        char firstStart = start.charAt(0);
        char secondStart = start.charAt(1);
        char thirdStart = start.charAt(2);
        char forthStart = start.charAt(3);

        int firstStartInt = Character.getNumericValue(firstStart);
        int secondStartInt = Character.getNumericValue(secondStart);
        int thirdStartInt = Character.getNumericValue(thirdStart);
        int forthStartInt = Character.getNumericValue(forthStart);

        char firstEnd = end.charAt(0);
        char secondEnd = end.charAt(1);
        char thirdEnd = end.charAt(2);
        char forthEnd = end.charAt(3);

        int firstEndInt = Character.getNumericValue(firstEnd);
        int secondEndInt = Character.getNumericValue(secondEnd);
        int thirdEndInt = Character.getNumericValue(thirdEnd);
        int forthEndInt = Character.getNumericValue(forthEnd);

        for (int i = firstStartInt; i < firstEndInt; i++) {
            if (i % 2 == 0) {
                i++;
            }
            for (int j = secondStartInt; j < secondEndInt; j++) {
                if (j % 2 == 0) {
                    j++;
                }
                for (int k = thirdStartInt; k < thirdEndInt; k++) {
                    if (k % 2 == 0) {
                        k++;
                    }
                    for (int l = forthStartInt; l < forthEndInt; l++) {

                        if (l % 2 == 0) {
                            l++;
                        }

                        System.out.print("" + i + j + k + l + " ");
                    }
                }
            }
        }
    }
}
