package MyOwnPractice;

public class Repli139 {
    boolean alphabetical(char c1, char c2) {
        boolean isInOrder = false;
        if (c1 > c2 ) {
            System.out.println(isInOrder);
            return false;
        }
        System.out.println(!isInOrder);
        return true;
    }

    public static void main(String[] args) {
        Repli139 obj = new Repli139();
        obj.alphabetical('d','a');

    }
}