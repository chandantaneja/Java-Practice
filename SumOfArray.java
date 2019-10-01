package Arrays;

import java.util.Scanner;

/**
 * Write a Java program to sum values of an array.
 */

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println("How many Integers ? ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] array = new int[num];


        for(int i = 0; i < num; i++){
            array[i] = scanner.nextInt();
        }

        sumOfArray(array);
    }

    private static void sumOfArray(int[] array){
        int sum = 0;
        for (int value: array){
            sum = sum + value;
        }

        System.out.print("The sum of the array is " + sum);
    }

}
