package MyOwnPractice;

import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {
        int[] elements=new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            elements[i]=input.nextInt();


        }
        for (int i = elements.length-1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    }

