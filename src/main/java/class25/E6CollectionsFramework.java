package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E6CollectionsFramework {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Orange");

        HashSet<String> hashset = new HashSet<>(fruit);
        System.out.println();
    }
}
