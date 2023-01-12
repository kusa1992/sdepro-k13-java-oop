package lab_02;

import java.util.Scanner;

public class Lab_02_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height in meter: ");
        float height = scanner.nextFloat();
        System.out.print("Please enter your weight in kilogram: ");
        float weight = scanner.nextFloat();
        float bmi = weight / (height * 2);
        double weightNeedToLose = Math.round((weight - 24.9 * height * 2) * 100.0)/100.0;
        double weightNeedToGain = Math.round((18.5 * height * 2 - weight) * 100.0)/100.0;
        if (bmi <= 18.5) {
            System.out.println("Underweight");
            System.out.println("You should gain: " + weightNeedToGain + "kg");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");

            System.out.println("You should lose: " + weightNeedToLose + "kg");
        } else {
            System.out.println("Obesity");
            System.out.println("You should lose: " + weightNeedToLose + "kg");
        }
    }
}