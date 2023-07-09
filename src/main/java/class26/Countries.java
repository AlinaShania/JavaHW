package class26;

import java.util.Map;
import java.util.TreeMap;

public class Countries {
    public static void main(String[] args) {
        TreeMap <String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Ukraine", "Kyiv");
        countries.put("Spain", "Madrid");
        countries.put("Italy", "Rome");
        countries.put("France", "Paris");

        for (Map.Entry<String, String> c : countries.entrySet()) {
            System.out.println(c);}
        for (String value : countries.values()) {
            System.out.print(value+" ");

        }
        for (String c:countries.keySet()){
            System.out.println(c);
        }

        for(var e:countries.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
