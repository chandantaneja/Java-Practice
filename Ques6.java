package Basics;

import java.util.Scanner;

public class Ques6 {
    public static void main(String[] args) {
        int multiplicand;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the multiplicand :   ");
        multiplicand = scanner.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println("" + multiplicand + "  *  " + "" + i + " =  "
                    + (multiplicand*i));
        }
    }
}
