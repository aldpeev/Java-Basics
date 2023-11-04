package Conditional_Statements_Lab;

import java.util.Scanner;

public class AreaFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();

        double area = 0;

        if (figure.equals("square")) {
            double num = Double.parseDouble(scanner.nextLine());
            area = num * num;

        } else if (figure.equals("circle")) {
            double num = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(num, 2);

        } else if (figure.equals("rectangle")) {
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            area = num * num2;
        } else {
            double num = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            area = (num * num2) / 2;
        }

        System.out.printf("%.3f", area);
    }
}
