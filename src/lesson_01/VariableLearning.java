package lesson_01;

public class VariableLearning {

    public static void main(String[] args) {
        // class name: PascalCase
        // variable name: camelCase: myNum, snake_case: my_num (hay dung trong Python)
        // ten bien phai co nghia
        // So Nguyen - thuong dung integer or long
        int myIntNum = 18;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(myIntNum);
        short myShortNum = 128;
        long myLongNum = 10L;
        myLongNum = 191919199L; // gan lai

        //So Thap phan
        float myFloatNum = 3.14f; //phai co chu f
        double myDoubleNum = 3.14D; //D is optional

        // Hang so/ constant
        final int MY_CONSTANT = 123; // hang so, unchangeable
    }
}
