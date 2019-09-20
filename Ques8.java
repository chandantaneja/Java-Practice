package Basics;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        int length, num, sum=0;
        System.out.println("How many number ?  ");
        Scanner scanner = new Scanner(System.in);
        length = scanner.nextInt();
        for(int i=0; i < length; i++){
            System.out.println("Enter number " + (i+1) + ":  ");
            num = scanner.nextInt();
            sum = sum + num;
        }
        System.out.println("Average of numbers is :" + (double)sum/(double) length);
    }
}
