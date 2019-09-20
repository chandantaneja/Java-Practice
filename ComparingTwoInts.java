package Basics;

import java.util.Scanner;

/**
 *  Write a Java program to compare two numbers.
 */
public class ComparingTwoInts {
    private boolean isFirstLessThanSecond(int x, int y){
        if (x < y) return true;

        else return false;
    }
    private boolean isFirstGreaterThanSecond(int x, int y){
        if (x > y) return true;
        else return false;
    }
    private boolean isEqual(int x, int y){
        if (x == y) return true;
        else return false;
    }

    public static void main(String[] args) {
        ComparingTwoInts comparingTwoInts = new ComparingTwoInts();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number >");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number > ");
        int num2 = scanner.nextInt();

        boolean isEqual = comparingTwoInts.isEqual(num1, num2);
        boolean isGreaterThan = comparingTwoInts.isFirstGreaterThanSecond(num1,num2);
        boolean isLessThan = comparingTwoInts.isFirstLessThanSecond(num1, num2);

        if (isEqual){
            System.out.println("The numbers are equal ");
        }
        if (isGreaterThan){
            System.out.println(num1 + " is greater than " + num2);
        }
        if (isLessThan){
            System.out.println(num1 + " is less than " + num2);
        }
    }
}
