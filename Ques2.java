package Basics;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integer 1 > ");
        num1 = scanner.nextInt();
        System.out.print("\n" + "Enter Integer 2 >  ");
        num2 = scanner.nextInt();
        System.out.print("\n" + "The sum of the integers is > " + (num1+num2));

    }
}
