package Basics;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        //swapping using a temporary variable

        int num1, num2, temp;
        System.out.println("Enter nos. to swap : ");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        System.out.println("Numbers before swapping \t a =" + num1 + "\t b= " + num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping \t a =  >"  + num1 + "\t b= " + num2);

        // swapping without a temp var
        //       System.out.println("Numbers before swapping \t a =" + num1 + "\t b= " + num2);
//          num1 = num1 + num2;
//          num2 = num1 - num2;
//          num1 = num1 - num2;
//        System.out.println("Numbers after swapping \t a =  >"  + num1 + "\t b= " + num2);
    }
}
