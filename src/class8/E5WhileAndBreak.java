package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        boolean summer = true;
        int temperature = 85;
        while (summer) {

            if (temperature<100) {
                System.out.println("It is good, I enjoy the summer");
            } else {
                System.out.println("It's very hot");
                break;
            }
            temperature=temperature+3;
        }
    }
}