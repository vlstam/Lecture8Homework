package mypack;

import java.util.Locale;
import java.util.Scanner;

public class Lecture8Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String input = scanner.next();
        boolean upperCase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowerCase = input.charAt(0) >= 97 && input.charAt(0) <= 122;

        boolean vowels = input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i")
                || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u");
        if(input.length() > 1){
            System.out.println("Entry is not a single character. Please enter a single letter");
        } else if(!(upperCase || lowerCase)){
            System.out.println("Entry not a letter. Please enter a letter");
        } else if(vowels){
            System.out.println("The letter is a vowel");
        } else {
            System.out.println("The letter is a consonant");
        }


    }
}
