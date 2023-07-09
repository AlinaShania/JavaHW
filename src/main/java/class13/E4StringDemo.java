package class13;

public class E4StringDemo {
    public static void main(String[] args) {

        String str = "Today is Sunday. we have java clas. we like Java";
        String [] strArr=str.split("[.!?]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
