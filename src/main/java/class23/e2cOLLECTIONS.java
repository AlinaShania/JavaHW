package class23;

import java.util.ArrayList;

public class e2cOLLECTIONS {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Ira");
        names.add("Julia");
        names.add("Victoria");
        names.add("Marina");
        names.add("Tetiana"); //passing an argument I think
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Vlad"));
        System.out.println(names.get(0));
        System.out.println(names.remove("Ira"));
        System.out.println(names);

    }
}
