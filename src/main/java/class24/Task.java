package class24;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alina");
        names.add("Marina");
        names.add("Irina");
        names.add("Karina");
        names.add("Sabrina");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Alla"));
        System.out.println(names.size());

    }
}
