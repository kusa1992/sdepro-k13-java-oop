package lab_13;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFactory {

    private static List<Book> bookList = new ArrayList<>();

    public static void printMenu() {
        System.out.println("======= Book Management Program (CRUD) =======");
        System.out.println("1. New book");
        System.out.println("2. Find a book (ISBN)");
        System.out.println("3. Update a book");
        System.out.println("4. Delete a book");
        System.out.println("5. Print the book list");
        System.out.println("0. Exit");
        System.out.println("==============================================");
    }

    public static List<Book> getBookListFromFile(String filePath) {
        System.out.println("[INFO] Reading data from ".concat(filePath));
        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String dataLine = bufferedReader.readLine();
            while (dataLine != null) {
                String bookName = dataLine;
                String isbn = bufferedReader.readLine().trim();
                String authorName = bufferedReader.readLine().trim();
                int year = Integer.parseInt(bufferedReader.readLine().trim());
                Book book = new Book(bookName, isbn, authorName, year);
                bookList.add(book);

                dataLine = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public static List<Book> addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input Title: ");
        String isbn = scanner.nextLine();
        System.out.print("Please input ISBN: ");
        String title = scanner.nextLine();
        System.out.print("Please input Author's Name: ");
        String author = scanner.nextLine();
        System.out.print("Please input Year: ");
        int year = scanner.nextInt();
        Book bookAddedByUser = new Book(isbn, title, author, year);
        bookList.add(bookAddedByUser);
        for (Book book : bookList) {
            System.out.println("Title: " + title + "\n   ISBN: " + isbn + "\n   Author: " + author + "\n   Year: " + year);
        }
        return bookList;
    }

    public static void saveToBookDB(String filePath) {
        System.out.println("[INFO] Saving data to".concat(filePath));
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filePath);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);) {
            for (Book book : bookList) {
                String dataLine = book.getBookName() + "\n" + "  " + book.getIsbn() + "\n" + "  " + book.getAuthorName() + "\n" + "  " + book.getYear();
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("[ERR] File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> findABook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input ISBN: ");
        String isbn = scanner.nextLine();
        List<Book> searchBook = new ArrayList<>();
        for (Book book : bookList) {
            if (isbn != book.getIsbn()) {
                System.out.println("No book found!");
                break;
            } else {
                searchBook.add(book);
                System.out.println("Your book is " + searchBook);
            }
        }
        return searchBook;
    }
}
