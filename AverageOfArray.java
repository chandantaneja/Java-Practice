package Arrays;

import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class AverageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements > ");
        int numOfElements = scanner.nextInt();
        int[] array = new int[numOfElements];
        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter element " + (i+1));
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }
        average = sum / array.length;

        System.out.println("The average is " + average);
    }
}
