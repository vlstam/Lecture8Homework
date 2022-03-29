package mypack;

import java.util.Scanner;

public class Lecture8Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Please enter year: ");
        year = scanner.nextInt();
        boolean isDivisableOf4=  year % 4 == 0;
        boolean isNotDivisableOf100 = year % 100 != 0;
        boolean isDivisableOf100And400 = year % 100 == 0 && year % 400 ==0;


        if(isDivisableOf4 && (isNotDivisableOf100 || isDivisableOf100And400)){
            System.out.println("It is a leap year");
        } else{
            System.out.println("It's not a leap year");
        }

    }
}
