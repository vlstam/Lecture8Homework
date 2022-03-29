package mypack;

import java.util.Scanner;

public class Lecture8Homework1 {
    public static void main(String[] args) {

        float price;
        int size;
        boolean isBlack = true;
        boolean canReturn = true;
        //String black = "black";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price: ");
        price = scanner.nextFloat();
        System.out.println("Size");
        size = scanner.nextInt();
        if((price <= 150) && (size >=44 && size <= 45) && (isBlack) && (canReturn)){
            System.out.println("I can buy these shoes");
        } else {
            System.out.println("I cannot buy these shoes");
        }

    }
}
