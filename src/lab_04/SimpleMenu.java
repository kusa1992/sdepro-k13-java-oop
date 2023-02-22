package lab_04;

import java.util.*;

public class SimpleMenu {
    private static int userInputNumber;
    private static List<Integer> myArrList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number from 1 to 5: ");
        int userInput = scanner.nextInt();
        do {
            switch (userInput) {
                case 1:
                    getUserNumbers();
                    break;
                case 2:
                    printNumber();
                    break;
                case 3:
                    getMaximumNumber();
                    break;
                case 4:
                    getMinimumNumber();
                    break;
                case 5:
                    System.out.println("Not implemented yet");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (userInput <= 5);
        System.out.print("Please input a number from 1 to 5");
    }

    public static List<Integer> getUserNumbers() {
        int inputTime = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input 5 numbers: ");
            userInputNumber = scanner.nextInt();
            myArrList.add(userInputNumber);
            inputTime++;
        }
        while(inputTime <= 5);
        return myArrList;
}

    public static void printNumber() {
        System.out.println("My numbers are " + myArrList);
    }

    public static int getMaximumNumber() {
        int maxNum = myArrList.get(0);
        for (int i = 0; i < myArrList.size(); i++) {
            if (maxNum < myArrList.get(i)) maxNum = myArrList.get(i);
        }
        return maxNum;
    }

    public static int getMinimumNumber() {
        int minNum = myArrList.get(0);
        for (int i = 0; i < myArrList.size(); i++) {
            if (minNum > myArrList.get(i)) minNum = myArrList.get(i);
        }
        return minNum;
    }
}

