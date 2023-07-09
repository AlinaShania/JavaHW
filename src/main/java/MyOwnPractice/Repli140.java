package MyOwnPractice;

public class Repli140 {


    static String maxLength ( String [] arr){
      String largest = "";
       for (int i = 0; i<arr.length; i++){
          if (arr[i].length() > largest.length()){
             largest = arr[i];
          }
       }  return largest ;

    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
