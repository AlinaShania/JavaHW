package MyOwnPractice;

import java.util.Scanner;

public class ArraysReversed {
    public static void main(String[] args) {
        int [] elements = new int [5];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<elements.length; i++){
            elements [i] = scanner.nextInt();
        }
        for (int i=elements.length-1; i>=0;i--){
            System.out.println(elements[i]+" ");
        }
    }
}
