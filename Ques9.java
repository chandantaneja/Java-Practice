package Basics;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        double lengthOfRectangle, breadthOfRectangle, perimeter, area;

        System.out.println("Enter Length of the Rectangle  ");
        Scanner scanner = new Scanner(System.in);
        lengthOfRectangle = scanner.nextDouble();
        System.out.println("Enter Breadth of Rectangle ");
        breadthOfRectangle = scanner.nextDouble();

        perimeter = 2*(lengthOfRectangle + breadthOfRectangle);
        area = lengthOfRectangle * breadthOfRectangle;
        System.out.println("Perimeter of Rectangle is " + perimeter);
        System.out.println("\nArea of Rectangle is " + area);

    }
}
