package class6;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner scanner= new Scanner (System.in);
        System.out.println("Please enter your height");
        int height=scanner.nextInt();
        if (height<60){
            System.out.println("You are short");
        }else if (height>=60 && height<=72){
            System.out.println("Your height is medium");
        }else if (height>70){
            System.out.println("You are tall");
        }

    }
}
