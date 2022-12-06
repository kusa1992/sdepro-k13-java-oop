package lesson_02;

public class PrefixPostfix {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        // truoc thuc thi: a = 2, b = 2
        //sau thuc thi: a = 2, b = 3, c = 4
        int c = ++a + b++;
        /*
        * prefix > right operand > assign result into left operand
        * a = 2
        * b = 2 + 1 = 3 (last)
        * c = 4
        * */

    }
}
