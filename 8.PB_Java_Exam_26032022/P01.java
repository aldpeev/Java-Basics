package PB_Java_Exam_26032022;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paintBox = Integer.parseInt(scanner.nextLine());
        int wallpapers = Integer.parseInt(scanner.nextLine());
        double priceGloves = Double.parseDouble(scanner.nextLine());
        double priceBrush = Double.parseDouble(scanner.nextLine());

        double pricePaint = paintBox * 21.5;
        double priceWallpapers = wallpapers * 5.2;
        double neededGloves = Math.ceil(wallpapers * 0.35);
        double neededBrushes = Math.floor(paintBox * 0.48);

        double totalPriceGloves = neededGloves * priceGloves;
        double totalPriceBrushes = neededBrushes * priceBrush;

        double totalPrice = pricePaint + priceWallpapers + totalPriceBrushes + totalPriceGloves;

        System.out.printf("This delivery will cost %.2f lv.",totalPrice / 15);
    }
}
