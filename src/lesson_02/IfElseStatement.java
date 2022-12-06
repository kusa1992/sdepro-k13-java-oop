package lesson_02;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        final int EXPECTED_TIME = 7;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter arrival time: "); //Print 1 dong
        int arrivalTime = scanner.nextInt();

        //Comparison operator: ==, !=, >, <, >=, <=
        // Dau = la gan, ==: so sanh
//        boolean isHeOnTime = (arrivalTime == EXPECTED_TIME);

        // Ternary operator | Toan tu 3 ngoi | Bieu thuc tam nguyen
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME ? true : false;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        if (isHeOnTime) {
            System.out.println("\t---> Let's talk!");
        } else {
            System.out.println("\t---> Write a letter");
        }

        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }
}
