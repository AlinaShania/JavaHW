package class10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter any number from 1 to 20");
        int x = scanner.nextInt();

        for (int i=x-1; i>=0; i--){
            System.out.print (i+" ");

        }

    }
}
