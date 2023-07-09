package class16;

public class Task {

    int sumArr (int [] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum+arr[i];
        } return sum;
    }

    public static void main(String[] args) {
        Task obj = new Task();
        int [] arr = {10,20,30};
            int result = obj.sumArr(arr);
        System.out.println(result);
    }
}
