package Basics;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        int num, reverse = 0, temp, numHolder;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number > ");
        num = scanner.nextInt();
        numHolder = num;
        for (;num>0;num = num/10){
            temp = num%10;
            reverse = reverse * 10  +  temp;
        }
        System.out.printf("Reverse of %d is %d", numHolder, reverse);

    }
}
