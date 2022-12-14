package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int[] myIntArray = new int[ARRAY_LENGTH];

        for (int index = 0; index < ARRAY_LENGTH; index++) {
            myIntArray[index] = index + 1;
        }
        // index = 0 | [0] || index = 2
        // index = 2 | [0, , 2], index = 4
        // index = 4 | [0,0,2,0,4] index = 6

//        for (int index = 0; index < ARRAY_LENGTH; index++) {
//            System.out.println(myIntArray[index]);
//        }
        for (int num : myIntArray) {
            System.out.println(num);
        }
    }
}
