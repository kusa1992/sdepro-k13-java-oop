package lab_13;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestBookFactory extends BookFactory {

    public static void main(String[] args) {
        String relativeFilePath = "/src/lab_13/BookDB.txt";
        String absoluteFilePath = System.getProperty("user.dir").concat(relativeFilePath);
        int userOption;
        boolean isContinue = true;
        printMenu();
        List<Book> bookList = BookFactory.getBookListFromFile(absoluteFilePath);
        Collections.sort(bookList);
        if (bookList == null)
            System.out.println("There is no book in the library!");
        while (isContinue) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a number from 0 to 5: ");
            userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    addBook();
                    saveToBookDB(absoluteFilePath);
                    break;
                case 2:
                    findABook();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    System.out.println("Exit!");
                    isContinue = false;
                    break;
                default:
                    return;
            }
        }
    }
}