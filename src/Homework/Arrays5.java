package Homework;

public class Arrays5 {
    public static void main(String[] args) {
       int [] numbers = {12,15,7,25,14};
       int largestNumber = 0;
       for(int i=0; i < numbers.length; i++){
    if (numbers[i]>largestNumber){
        largestNumber=numbers[i];
    }
       }
        System.out.println(largestNumber);
    }
}
