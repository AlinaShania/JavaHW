package class26;

import java.util.*;

public class E3Maps {
    public static void main(String[] args) {
        Map<String, Double> drinks = new HashMap<>();

        drinks.put("Coke", 2.0);
        drinks.put("Milk", 5.0);
        drinks.put("Mango Juice", 2.5);
        drinks.put("Coffee", 3.0);
        drinks.put("Tea", 3.5);

        Set<Map.Entry<String, Double>> entrySet = drinks.entrySet();
        for (Map.Entry<String, Double> e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        List<Map<String, Double>> mapList = new ArrayList<>();
    }
}
