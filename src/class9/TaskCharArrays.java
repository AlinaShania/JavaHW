package class9;

public class TaskCharArrays {
    public static void main(String[] args) {

        for (int i=0;i<5;i++){
            if (i%2==0){
                System.out.println(i);

            }
        }

        char [] chars={'a','b','c','d','e'};
        for ( int i=0; i<5; i+=2) {
            if (i%2==0){
                System.out.println(chars[i]);
            }
        }

    }
}
