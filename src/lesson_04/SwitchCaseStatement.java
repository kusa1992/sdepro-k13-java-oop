package lesson_04;

import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int userInput = scanner.nextInt();

//        if (userInput == 1) {
//            System.out.println("Giai nhat");
//        } else if (userInput == 2) {
//            System.out.println("Giai nhi");
//        } else if (userInput == 3) {
//            System.out.println("Giai ba");
//        } else {
//            System.out.println("Chuc ban may man lan sau!!");
//        }

        switch (userInput) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays!");
                break;
            case 7:
            case 8:
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Invalid date!");
        }
    }
}
