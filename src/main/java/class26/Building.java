package class26;

import java.util.LinkedHashMap;

public class Building {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> buildings = new LinkedHashMap<>();
        buildings.put(1,"Google");
        buildings.put(2,"Syntax");
        buildings.put(3,"Microsoft");
        buildings.put(4,"Amazon");
        buildings.put(5,"Apple");
        buildings.put(6,"Cydeo");
        buildings.put(7,"Best Buy");

        System.out.println( buildings.size());

        buildings.replace(4,"Walmart");
        buildings.remove(7);
        System.out.println(buildings);








    }
}
