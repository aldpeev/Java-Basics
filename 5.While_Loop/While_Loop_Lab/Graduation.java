package While_Loop_Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameStudent = scanner.nextLine();

        double gradeSum = 0;
        int n = 0;
        int badGrade = 0;

        while (n < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradeSum += grade;

            if (grade < 4.0) {
                badGrade++;
            }

            if (badGrade > 1) {
                break;
            }

            n++;
        }

        if (badGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", nameStudent, n);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", nameStudent, gradeSum / 12);
        }
    }
}
