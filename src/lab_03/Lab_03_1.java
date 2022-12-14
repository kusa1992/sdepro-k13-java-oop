package lab_03;

public class Lab_03_1 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        int len = intArr.length;
        int evenCount = 0;
        for (int i = 0; i < len; i++) {
            if (intArr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.printf("Number of even numbers is %d\n", evenCount);
        System.out.printf("Number of odd numbers is %d\n", len - evenCount);
    }
}

