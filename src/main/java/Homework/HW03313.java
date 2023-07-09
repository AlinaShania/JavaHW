package Homework;

import java.util.Scanner;

public class HW03313 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Quiz Score here");
        double scoreQuiz = scanner.nextDouble();
        System.out.println("Please enter your Mid Terms score here");
        double scoreMidTerms = scanner.nextDouble();
        System.out.println("Please enter your Final Score here");
        double scoreFinals = scanner.nextDouble();

        double averageScore = (scoreQuiz + scoreMidTerms +scoreFinals) /3;

        if (averageScore >=90){
            System.out.println("Your grade is A");
        } else if (averageScore >=70 && averageScore <=90){
            System.out.println("Your grade is B");
        } else if (averageScore >=50 && averageScore <70){
            System.out.println("Your grade is C");
        } else if (averageScore<50){
            System.out.println("Your grade is F");
        }
    }
}
