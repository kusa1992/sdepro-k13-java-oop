package lesson_05;

import java.util.*;

public class RemovingDuplicatedValues {

    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.add(2);
        myArrayList.add(3);

        /*
         * Lay 3 gia tri nho nhat cua myArrayList
         * Remove duplicate
         * Sort array -> Get 3 first values
         */

        List<Integer> withoutDuplicatedValueList = new ArrayList<>();
        for (Integer number : myArrayList) {
            if (!withoutDuplicatedValueList.contains(number)) {
                withoutDuplicatedValueList.add(number);
            }
        }

        System.out.println(myArrayList);
        Collections.sort(withoutDuplicatedValueList);
        System.out.println(withoutDuplicatedValueList);

        // Set : lay ra 1 cai list remove duplicate va sort
        Set<Integer> set = new HashSet<>(myArrayList);
        myArrayList = new ArrayList<>(set);
        System.out.println(set);

        // Sublist
        List<Integer> first3MinValues = withoutDuplicatedValueList.subList(0,3); // So 3 va exclusive, chi la ranh gioi
        System.out.println(first3MinValues);
    }
}
