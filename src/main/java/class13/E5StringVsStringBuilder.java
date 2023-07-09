package class13;

public class E5StringVsStringBuilder {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Java");

        System.out.println(str.reverse());

        String str1="Computer";
        StringBuilder str2 = new StringBuilder (str1);
        System.out.println(str2);

    }
}
