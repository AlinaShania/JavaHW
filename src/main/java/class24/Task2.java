package class24;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coca cola");
        drinks.add("milk");
        drinks.add("tequila");
        drinks.add("lemonade");


        for (int i =0; i<drinks.size();i++){
            String drink = drinks.get(i);
            if (drink.contains("a")||drink.contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}


