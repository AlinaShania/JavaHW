package Homework;

import java.util.Scanner;

public class Hwo03311 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter current time");
        int time = scanner.nextInt();
        if (time>= 1 && time <=11){
            System.out.println(" It Is Morning");
        } else if (time >=12 && time <=15){
            System.out.println("It is Afternoon");
        } else if (time >=16 && time<=20){
            System.out.println("It is Evening");
        }else if (time >=21 && time <=24){
            System.out.println("Please go to Sleep");
        }
    }
}
