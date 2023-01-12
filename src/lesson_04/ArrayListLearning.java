package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        List<Integer> myArrayList = new ArrayList<>(); // Co the add, remove item
        List<Integer> myArrayList2 = Arrays.asList(1, 2, 3); // Behave nhu 1 cai list fixed cung, la data lay ra de xu ly chu khong add them items duoc -> run se bi error

        Integer[] arr = {1, 2, 3};
        List<Integer> myArrayList3 = Arrays.asList(arr); // = myArrList2

        // CRUD
        myArrayList.add(1);
        myArrayList.add(2);
//        myArrayList.remove(1);
//        myArrayList.add(0, 3);
        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index));
        }
        System.out.println(myArrayList);


    }
}
