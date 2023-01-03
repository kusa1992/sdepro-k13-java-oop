package lesson_04;

public class ArrayPostfixPrefix {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a + b++;
        int[] myIntArray = {9, 9, 9, 9, 9};

        for (int index = 0; index < 5; index++) {
            myIntArray[index] = index + 1;
            // myIntArray[index] = index + 1;
            // index 0, index 1
        }

        for (int value : myIntArray) {
            System.out.println(value);
        }
    }
}
