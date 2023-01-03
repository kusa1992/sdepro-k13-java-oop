package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {

    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNumber = new SecureRandom().nextInt(5);
        System.out.println("Random number: " + randomNumber);

        do {
            // Guessing number
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your guessing number: ");
            int userInput = scanner.nextInt();

            if (userInput == randomNumber) {
                System.out.println("Hooray! It's correct!");
                break;
            }

            guessingTime++;

        } while (guessingTime < 3);

        System.out.println("See you again!");
    }
}
