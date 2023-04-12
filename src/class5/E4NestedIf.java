package class5;

import java.util.Scanner;

public class E4NestedIf {
    public static void main(String[] args) {

        int money=5000;
        String dayOfTheWeek="Monday";
        if(money > 10000){
            if(dayOfTheWeek.equals("Sunday")){
                System.out.println("Let's go shopping");
            }else {
                System.out.println("Lets go next time");
            }
            }else {
            System.out.println("Lets save more");
        }
        }

    }

