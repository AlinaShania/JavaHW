package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("What is your age?");

        int age= scanner.nextInt();
        if(age<18){
            System.out.println("You can't drive, please come back once you turn 18");
        }else if (age>=18){
            System.out.println("Yay! You can drive");
        }
    }
}
