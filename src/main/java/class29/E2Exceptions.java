package class29;

public class E2Exceptions {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e){
            System.out.println("Please do not divide by zero");
        }
    }
}
