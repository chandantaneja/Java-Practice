package Basics;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num > ");
        num1 = scanner.nextInt();
        System.out.println("Enter second num > ");
        num2 = scanner.nextInt();
        System.out.println("The result is >" + ((double)num1/(double) num2));

    }
}
