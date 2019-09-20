package Basics;


import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number > ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number > ");
        num2 = scanner.nextInt();
        if (num1 > num2){
            System.out.printf("%d > %d", num1, num2);
        }
        else if (num2 > num1) {
            System.out.printf("%d > %d", num2, num1);
        }
        else{
            System.out.printf("%d = %d", num1, num2);
        }
    }
}
