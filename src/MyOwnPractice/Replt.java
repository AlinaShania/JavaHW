package MyOwnPractice;

import java.time.MonthDay;
import java.util.Scanner;

public class Replt {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int b = 2; b <= 20; b++) {
            if (b % 2 == 0) {
                System.out.print(b + " ");
            }
        }
        System.out.println();
        for (int a = 3; a <= 30; a++) {
            if (a % 3 == 0) {

                System.out.print(a + " ");
            }
        }
        System.out.println();
        for (int c= 4; c<=40; c++){
            if (c%4==0){
                System.out.print(c+" ");
            }
        }
        System.out.println();
        for (int d= 5; d<=50; d++){
            if (d%5==0){
                System.out.print(d+" ");
            }
        }

    }

}


