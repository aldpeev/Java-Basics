package While_Loop_Exercises;

import java.util.Scanner;

public class P02ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrades = Integer.parseInt(scanner.nextLine());

        String task = scanner.nextLine();

        int badGrades = 0;
        double gradeSum = 0.0;
        int numTasks = 0;
        boolean needBreak = false;
        String lastTask = "";

        while (!task.equals("Enough")) {
            lastTask = task;

            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                badGrades++;
            }

            if (badGrades == maxBadGrades) {
                needBreak = true;
                break;
            }

            gradeSum += grade;
            numTasks++;

            task = scanner.nextLine();
        }

        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.", badGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", gradeSum / numTasks, numTasks,lastTask);
        }

    }
}
