package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E3Sets {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Farwa");
        names.add("Farwa");
        System.out.println(names);

        HashSet<String> uniqNames = new HashSet<>();
        uniqNames.add("yellow");
        uniqNames.add("apple");
        uniqNames.add("banana");
        uniqNames.add("orange");
        uniqNames.add("green");
        System.out.println(uniqNames);
    }
}
