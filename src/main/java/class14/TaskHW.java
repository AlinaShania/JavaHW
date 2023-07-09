package class14;

public class TaskHW {

    boolean isPalindrome (String str ){

        String reversedStr = "";
        for (int i=str.length()-1; i>=0;i--){
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome = false;
        if (str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome= true;
        }
        return isStrPalindrome;
    }


    public static void main(String[] args) {
         TaskHW task1 = new TaskHW();
         boolean result = task1.isPalindrome("car");
        System.out.println(result);
    }
}
