package MyOwnPractice;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hi! May I ask you how old are You?");

        int age=scan.nextInt();
        if(age>18){
            System.out.println("Congratulations! You will receive your new Drivers License soon");
        }else if(age<18){
            System.out.println("Only learners permit can be offered to you at this time. Thank You.");
        }
    }
}
