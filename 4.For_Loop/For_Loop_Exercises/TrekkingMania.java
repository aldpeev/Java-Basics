package For_Loop_Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double m1 = 0.0;
        double m2 = 0.0;
        double m3 = 0.0;
        double m4 = 0.0;
        double m5 = 0.0;

        for (int i = 0; i < n; i++) {
            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5 && people > 0) {
                m1 += people;
            } else if (people <= 12) {
                m2 += people;
            } else if (people <= 25) {
                m3 += people;
            } else if (people <= 40) {
                m4 += people;
            } else {
                m5 += people;
            }
        }

        double allPeople = m1 + m2 + m3 + m4 + m5;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n", (m1 / allPeople) * 100, (m2 / allPeople) * 100,(m3 / allPeople) * 100,
        (m4 / allPeople) * 100,(m5 / allPeople) * 100);
    }
}
