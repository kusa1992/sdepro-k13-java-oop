package lab_06;

import java.util.Scanner;

public class InputMaximum3Times {

    public static void main(String[] args) {
        String myPassword = "password123";
        int inputTime = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input a password: ");
            String userInput = scanner.next();
            if (userInput.equals(myPassword)){
                System.out.println("Successful Login!");
                break;
            } else {
                System.out.println("Wrong password!");
            }
            inputTime++;

        } while (inputTime < 3);
    }
}
