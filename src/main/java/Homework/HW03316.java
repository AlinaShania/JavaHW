package Homework;

import java.util.Scanner;

public class HW03316 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your First number");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter your Second number");
        double number2 = scanner.nextDouble();
        System.out.println("Please enter the Operator you would like to use");
        char operator = scanner.next().charAt(0);


        switch (operator) {
            case '+' :
                System.out.println(number1+number2);
                break;
            case '-' :
                System.out.println(number1-number2);
                break;
            case '*' :
                System.out.println(number1*number2);
                break;
            case '/' :
                System.out.println(number1/number2);
            default :
                System.out.println("Wrong operator used");
        }
    }
}
