package mypack;

import java.util.Scanner;

public class Lecture8Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1;
        double x2;
        double a;
        double b;
        double c;
        double disc;
        System.out.println("Please enter a: ");
        a = scanner.nextDouble();
        System.out.println("Please enter b: ");
        b = scanner.nextDouble();
        System.out.println("Please enter c: ");
        c = scanner.nextDouble();

        if (a == 0) {
            double x;
            x = -c / b;
            System.out.println(x);

        } else if (b == 0) {
            x1 = x2 = -c / a;
            if (-c / a < 0) {
                System.out.println("Error1");
            } else {
                x1 = x2 = Math.sqrt(c) / Math.sqrt(a);
                System.out.println(x1 + " " + x2);
            }
        } else if (c == 0) {
            x1 = 0;
            x2 = -b / a;
            System.out.println(x1 + " " + x2);
        } else {
            disc = Math.pow(b, 2) - 4 * a * c;
            if (disc < 0) {
                System.out.println("Error3");
            } else if (disc == 0) {
                x1 = x2 = -b / 2 * a;
                System.out.println("x1 and x2 are the same " + x1 + " and " + x2);
            } else {
                if (b % 2 == 0) {
                    disc = Math.pow(b, 2) - a * c;
                    if (disc == 0) {
                        x1 = x2 = -b / 2 * a;
                        System.out.println(x1);
                    } else if (disc < 0) {
                        System.out.println("No solution!");
                    } else {
                        x1 = -b + Math.sqrt(disc) / a;
                        x2 = -b - Math.sqrt(disc) / a;
                        System.out.println(x1 + " " + x2);
                    }

                } else {
                    x1 = -b + Math.sqrt(disc) / 2 * a;
                    x2 = -b - Math.sqrt(disc) / 2 * a;
                    System.out.println(x1 + " and " + x2);

                }
            }
        }
    }
}