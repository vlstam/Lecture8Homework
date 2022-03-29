package mypack;

import java.util.Scanner;

public class Lecture8Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.println("Please enter first number: ");
        a = scanner.nextDouble();
        System.out.println("Please enter second number: ");
        b = scanner.nextDouble();
        if(Math.abs(a - b) < 0.1){
            System.out.println("There is a difference in the first digit after the decimal separator");
        } else if(Math.abs(a - b) < 0.01){
            System.out.println("There is a difference in the second digit after the decimal separator");
        }else if(Math.abs(a - b) < 0.001){
            System.out.println("There is a difference in the third digit after the decimal separator");
        }else if(Math.abs(a - b) < 0.0001){
            System.out.println("There is a difference in the fourth digit after the decimal separator");
        } else{
            System.out.println("The numbers are equal up to four digits after the decimal separator");
        }
    }



}
