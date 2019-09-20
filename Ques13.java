package Basics;

import java.util.Scanner;

public class Ques13 {
    public static void main(String[] args) {
        int num,numHolder, temp, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer > ");
        num = numHolder = scanner.nextInt();

        for (;num > 0; num = num/10){
            temp = num % 10;
            sum = sum + temp;
        }
        System.out.printf("Sum of the digits of %d is %d", numHolder, sum);
    }
}
