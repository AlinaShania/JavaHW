package class14;

public class Task {

    void printLarger (int a,int b){
        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

    }

    public static void main(String[] args) {
        Task e7 = new Task();

        e7.printLarger(10,30);
    }
}
