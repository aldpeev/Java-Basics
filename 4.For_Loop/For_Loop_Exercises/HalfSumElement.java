package For_Loop_Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sumAll = 0;
        int sumAllWithoutMaxNum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > maxNum){
                maxNum = num;
            }
            sumAll += num;
        }
        sumAllWithoutMaxNum = sumAll - maxNum;

        if (maxNum == sumAllWithoutMaxNum){
            System.out.printf("Yes%nSum = %d",maxNum);
        }else{
            System.out.printf("No%nDiff = %d", Math.abs(sumAllWithoutMaxNum - maxNum));
        }
    }
}
