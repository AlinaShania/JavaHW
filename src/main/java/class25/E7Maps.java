package class25;

import java.util.HashMap;

public class E7Maps {
    public static void main(String[] args) {
        HashMap<String,Double> grocery = new HashMap<>();
        grocery.put("Apple",2.5);
        grocery.put("soap",2.9);
        grocery.put("eggs",3.5);
        grocery.put("milk",4.5);
        grocery.put("Apple",4.5);

        System.out.println(grocery);
        System.out.println(grocery.size());
        System.out.println(grocery.containsKey("Banana"));

    }
}
