package Basics;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of the Circle >  ");
        radius = scanner.nextDouble();
        System.out.println("The Perimeter is > " + 2*Math.PI*radius);
        System.out.println("The Area is > " + Math.PI*radius*radius);
    }
}
