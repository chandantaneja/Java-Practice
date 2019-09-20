package Basics;

import java.util.Scanner;

public class Ques15{

    private void swapUsingTemp(int x, int y){
        int temp;
        temp = x;
        System.out.println("Before Swapping with temp x = " + x + " y = " + y);
//        System.out.println("x = " + x + " y = " + y + " temp = " +temp);
        x = y;
//        System.out.println("x = " + x + " y = " + y + " temp = " +temp);
        y = temp;
//        System.out.println("x = " + x + " y = " + y + " temp = " +temp);
        System.out.println("After Swapping with temp x = " + x + " y = " + y);

    }
    private void swapWithoutTemp(int x, int y){
        System.out.println("Before Swapping without temp x = " + x + " y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping without temp x = " + x + " y = " + y);
    }
    public static void main(String[] args){

        Ques15 ques15 = new Ques15();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1:> ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number 2:> ");
        int num2 = scanner.nextInt();
        ques15.swapUsingTemp(num1, num2);
        ques15.swapWithoutTemp(num1,num2);
    }
}