package lesson_02;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // Right operand (ve ben phai)
        int tong = myNum1 + myNum2;
        System.out.println("Total: " + tong);

        // Total is %d (placeholder cua int)
        System.out.printf("Total is %d\n", tong);
        System.out.printf("Boolean value is %b\n", true);
        System.out.printf("Float value is %f\n", 3.14f);
        System.out.printf("Character value is %s\n", 'a');

        // Chia binh thuong
        float myFloatNumber = 3/2f;
        System.out.println(myFloatNumber);

        // Chia lay phan nguyen
        System.out.println(5 / 2);
        // Chia lay phan du
        System.out.println(5 % 2);
    }
}
