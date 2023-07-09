package MyOwnPractice;

public class Replit141 {
 public static int maxValue(int [] arr){
    int largest = 0;
    for (int i = 0; i< arr.length; i++){
        if (arr[i]>largest){
            largest = arr[i];
        }
    }return largest;
}

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

}
