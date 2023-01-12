package lesson_06;

public class Calculator {

    // Method signature

    // Method overloading: Ky thuat ma method name giong nhau nhung khac ve parameter (so luong, data type)
    // Khong co overloading khi khac kieu tra ve, method name, access modifiers.
    public int sum(int num1, int num2) {
        return num1 + num2;

    }

    public int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // Varargs | Rest Parameters
    // tat ca nhung con so trong restNumbers la 1 array
    public int sum(int... restNumbers) {
        int arrTotal = 0;
        for (int number : restNumbers) {
            arrTotal = arrTotal + number;
        }
        return arrTotal;
    }

    // WHEN overloading happens | Compile Time
    // WHEN overriding happens | Run Time -> Object duoc sinh ra
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(1, 2);
        System.out.println(calculator.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(calculator.sum(1, 2, 3));
    }

}
