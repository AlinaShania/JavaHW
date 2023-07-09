package Class15;

import MyOwnPractice.HW;

import java.util.Arrays;

public class HWTask2 {

    int [] createArray(int size){
        int [] arr = new int [size];
        for (int i = 0; i< size; i++){
            arr[i]=10;
        }
        return arr;

    }

    public static void main(String[] args) {

        HWTask2 E1 = new HWTask2();
        int [] array = E1.createArray(5);
        System.out.println(Arrays.toString(array));
    }
}
