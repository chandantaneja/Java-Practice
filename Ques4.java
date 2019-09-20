package Basics;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1 >  ");
        num1 = scanner.nextDouble();
        System.out.println("Enter Number 2 >  ");
        num2 = scanner.nextDouble();
//        System.out.println("The required product is > " + (num1*num2));

        System.out.printf("the product is \n" + "%10.5f", (num1*num2));

    }
}
