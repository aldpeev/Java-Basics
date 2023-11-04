package While_Loop_Exercises;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeSpaceWidth = Integer.parseInt(scanner.nextLine());
        int freeSpaceLength = Integer.parseInt(scanner.nextLine());
        int freeSpaceHeight = Integer.parseInt(scanner.nextLine());

        int freeSpace = freeSpaceHeight * freeSpaceLength * freeSpaceWidth;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            freeSpace -= Integer.parseInt(input);
            if (freeSpace <= 0) {
                break;
            }
            input = scanner.nextLine();
        }

        if (freeSpace <= 0){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(freeSpace));
        } else  {
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
