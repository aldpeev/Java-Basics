package PB_Java_Exam_Preparation;

import java.util.Scanner;

public class P04EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int r = 0;
        int g = 0;
        int b = 0;
        int o = 0;

        int max = Integer.MIN_VALUE;
        String color = "";

        for (int i = 0; i < n; i++) {
            String egg = scanner.nextLine();
            switch (egg) {
                case "red":
                    r++;
                    if (max < r){
                        max = r;
                        color = "red";
                    }
                    break;
                case "green":
                    g++;
                    if (max < g){
                        max = g;
                        color = "green";
                    }
                    break;
                case "blue":
                    b++;
                    if (max < b){
                        max = b;
                        color = "blue";
                    }
                    break;
                case "orange":
                    o++;
                    if (max < o){
                        max = o;
                        color = "orange";
                    }
                    break;
            }
        }

        System.out.printf("Red eggs: %d%nOrange eggs: %d%nBlue eggs: %d%nGreen eggs: %d%n"+
                "Max eggs: %d -> %s%n",r,o,b,g,max, color);

    }
}
