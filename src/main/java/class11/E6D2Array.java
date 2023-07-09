package class11;

public class E6D2Array {
    public static void main(String[] args) {

        boolean[][] arr2D = {
                {true,false,true,true,false},
                {true,false,false,false,false}
        };
        int sum= 0;
        for (boolean[] arr1 : arr2D) {
            for (boolean times : arr1) {
               if (times==true){
                   sum++;
               }
            }
        }
        System.out.println(sum);
    }
}
