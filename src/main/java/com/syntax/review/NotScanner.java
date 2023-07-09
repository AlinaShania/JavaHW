package com.syntax.review;

import java.util.Scanner;

public class NotScanner {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("Please enter full sentence");

        String sentence = key.nextLine();
        System.out.println(sentence);
        System.out.println("Please enter one word");
        String word = key.next();
        System.out.println("Word that was captured = "+word);
        System.out.println("Please enter int value");
        int i =10;
        int number = key.nextInt();
        System.out.println("Entered number is =");
        System.out.println("Please enter decimal value");
        double decimal = key.nextDouble();
        System.out.println("Decimal value = "+decimal);

    }
}
