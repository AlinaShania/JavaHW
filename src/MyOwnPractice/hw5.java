package MyOwnPractice;

import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the city");
        String city=scan.next();
        System.out.println("What is the temperature outside right now?");

        int temperatureF= scan.nextInt();
        int temperatureC=(temperatureF-32)*5/9;
        System.out.println("The temperature is "+temperatureC+" right now");

    }
}
