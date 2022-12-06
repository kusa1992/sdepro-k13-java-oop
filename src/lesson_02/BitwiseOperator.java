package lesson_02;

public class BitwiseOperator {
    public static void main(String[] args) {
        if (getFirstNum() != 0 && getSecondNum() != 0){
            System.out.println("Calculating...");
        }
    }

    private static int getFirstNum() {
        System.out.println("Calling getting first num!");
        return 0;
    }

    private static int getSecondNum() {
        System.out.println("Calling getting second num!");
        return 2;
    }
}
