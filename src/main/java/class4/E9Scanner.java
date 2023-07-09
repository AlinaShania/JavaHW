package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Are You Hungry Enter True/False");
        boolean hungry=scanner.nextBoolean();
        if(hungry){
            System.out.println("Lets order pizza");
        } else {
            System.out.println("Lets practice JAVA");
        }

    }
}
