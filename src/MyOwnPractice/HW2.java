package MyOwnPractice;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Hi there! What is the estimated amount of loan needed for you today?");

        int loan=scanner.nextInt();
        if(loan<=200000){
            System.out.println("Congratulations! Your loan application has been approved! Let's get on it.");
        } else if(loan>200000) {
            System.out.println("We regret to inform you but your loan application has been denied. Please come back when you improve your credit score.");
        }
    }
}
