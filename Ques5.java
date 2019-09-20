package Basics;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        //last on arithmetic
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 > ");
        num1 = scanner.nextDouble();
        System.out.println("Enter number 2 > ");
        num2 = scanner.nextDouble();
        System.out.printf("The sum is > %10.3f", (num1+num2));
        System.out.printf("\n" + "The Product is > %10.3f", (num1*num2));


    }
}
