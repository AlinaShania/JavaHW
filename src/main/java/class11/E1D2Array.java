package class11;

public class E1D2Array {
    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        for (int i=0; i<arr.length; i++){
            for (int j =0; j < arr[i].length; j++){
                int element = arr[i][j];
                if (element%2!=0){
                    System.out.print(element+" ");
                }
            }
        }
    }
}
