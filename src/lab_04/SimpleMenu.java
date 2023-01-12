package lab_04;

import java.util.*;

public class SimpleMenu {

    public static void main(String[] args) {

        // 1. Add numbers into Array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the 1st number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Please enter the 2nd number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Please enter the 3rd number: ");
        int thirdNum = scanner.nextInt();
        System.out.print("Please enter the 4th number: ");
        int fourthNum = scanner.nextInt();
        System.out.print("Please enter the 5th number: ");
        int fifthNum = scanner.nextInt();

        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(firstNum);
        myArrayList.add(secondNum);
        myArrayList.add(thirdNum);
        myArrayList.add(fourthNum);
        myArrayList.add(fifthNum);

        Set<Integer> set = new HashSet<>(myArrayList);

        // 2. Print numbers
        System.out.println("My numbers are " + set);

        // 3. Get maximum number
        int maxNum = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (maxNum < myArrayList.get(i))
                maxNum = myArrayList.get(i);
        }
        System.out.println("Maximum Number is: " + maxNum);

        // 4. Get minimum number
        int minNum = myArrayList.get(0);
        for (int i = 0; i < myArrayList.size(); i++) {
            if (minNum > myArrayList.get(i))
                minNum = myArrayList.get(i);
        }
        System.out.println("Minimum number is: " + minNum);

        // 5. Search number
        System.out.println(myArrayList.contains(16));
    }
}

