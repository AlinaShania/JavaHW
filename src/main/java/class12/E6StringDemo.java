package class12;

import java.sql.SQLOutput;

public class E6StringDemo {
    public static void main(String[] args) {

        String name = "Justin";
        System.out.println(name.equals("Axel"));
        System.out.println(name.equals("JUSTIN"));
        System.out.println(name.equalsIgnoreCase("JUSTIN"));
    }
}
