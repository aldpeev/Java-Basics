package For_Loop_Exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;

        for (int i = 0; i < n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200) {
                p1 += 1;
            } else if (num <= 399) {
                p2 += 1;
            } else if (num <= 599) {
                p3 += 1;
            } else if (num <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
        double sumAllPercentage = p1 + p2 + p3 + p4 + p5;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", ((p1 / sumAllPercentage) * 100), ((p2 / sumAllPercentage) * 100),
                ((p3 / sumAllPercentage) * 100), ((p4 / sumAllPercentage) * 100), ((p5 / sumAllPercentage) * 100));

    }
}
