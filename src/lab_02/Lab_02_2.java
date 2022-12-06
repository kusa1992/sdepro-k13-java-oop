package lab_02;

import java.util.Scanner;

public class Lab_02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int myNumber = scanner.nextInt();
        if (myNumber % 2 == 0) {
            System.out.println("Your number is an even number.");
        } else {
            System.out.println("Your number is an odd number.");
        }
    }
}
