package Basics;

import java.util.Scanner;

/**
 * Write a Java program to count the letters, spaces, numbers and other characters of an input string.
 */
public class CountLettersSpacesSpecialChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String : ");

        String inputString = scanner.nextLine();
        CountLettersSpacesSpecialChars countLettersSpacesSpecialChars = new CountLettersSpacesSpecialChars();
        countLettersSpacesSpecialChars.countCaptitalLetter(inputString);
//        System.out.println(capitalLetters);
    }
//    private int countCaptitalLetter(String stringCaptialLetters){
//        int countCapitalLetter = 0;
//        for (int i=0; i < stringCaptialLetters.length(); i++){
//            if (stringCaptialLetters.charAt(i) >= 65 && stringCaptialLetters.charAt(i) <= 90){
//                System.out.println(stringCaptialLetters.charAt(i) + countCapitalLetter);
//                countCapitalLetter++;
//            }
//        }
//        return countCapitalLetter;
//    }

    private void countCaptitalLetter(String inputString){
        if (inputString.charAt(5) >= 65 && inputString.charAt(5) <= 90){
            System.out.println("Yes it is capital");
        }else if (inputString.charAt(5) == 32){
            System.out.println("It is a space");
        }else if (inputString.charAt(5) >= 33 && inputString.charAt(5) <= 63){
            System.out.println("It is a space");
        }else if (inputString.charAt(5) >= 97 && inputString.charAt(5) <= 122){
            System.out.println("It is in small");
        }
    }
}
