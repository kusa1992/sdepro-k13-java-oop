package lab_02;

import java.util.Scanner;

public class Lab_02_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height in meter: ");
        float height = scanner.nextFloat();
        System.out.print("Please enter your weight in kilogram: ");
        float weight = scanner.nextFloat();

        float bmi = weight / (height * 2);
        if (bmi <= 18.5) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}