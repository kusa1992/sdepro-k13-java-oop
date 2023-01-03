package lesson_04;

import java.security.SecureRandom;

public class FunctionLearning {

    public static void main(String[] args) {
        // Parameter(s) vs argument(s)
        printNumber();
        System.out.println("bla bla bla");
    }

    // DRY: Don't Repeat Yourself!
    // SOLID:
    // S: Single Responsibility

    // name : parameter
    // varargs, rest parameters
    // Exclusive
    public static int getARandomNumber(int boundary) {
        return new SecureRandom().nextInt(boundary);
    }

    public static void printNumber() {
        for (int index = 0; index < 10; index++) {
            if (index == 8) return;
            else System.out.println(index);
        }

        System.out.println("End the program!");
    }
}
