package Class15;

import java.util.Scanner;

public class SomeHWTask3 {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i =0; i<word.length(); i++){
            if (word.charAt(i)=='a'|| word.charAt(i)=='e' || word.charAt(i)=='o' || word.charAt(i)=='u' || word.charAt(i)=='i'){
                System.out.print(word.charAt(i));
            }
        }
    }
}
