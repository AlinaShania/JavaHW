package class22;

import java.util.Scanner;

public class Task {
    Scanner input = new Scanner(System.in);
    public boolean numFromArr(int[] arr) {
        boolean isNumber = false;
        int a = input.nextInt();
        for (int i : arr) {
            if (i == a) {
                isNumber = true;
                break;
            }
        }
        return isNumber;
    }

    void findNum(int [] array, int numToFind) {
        boolean isFound = false;
        for (int i: array){if (numToFind ==i) {isFound=true;}}
        System.out.println(isFound);
    }
}
