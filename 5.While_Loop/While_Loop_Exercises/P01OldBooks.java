package While_Loop_Exercises;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();

        int searchedBooks = 0;

        String currentBook = "";
        while (!book.equals(currentBook)){
            currentBook = scanner.nextLine();

            if (currentBook.equals("No More Books")){
                break;
            }

            if (currentBook.equals(book)){
                continue;
            }

            searchedBooks ++;
        }

        if (book.equals(currentBook)){
            System.out.printf("You checked %d books and found it.", searchedBooks);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", searchedBooks);
        }
    }
}
