package class24;

import java.util.ArrayList;
import java.util.List;

public class E10ArrayList {
    public static void main(String[] args) {
        List<Integer> names = new ArrayList<>(); //here we can go to any element we want
       // List<String> names2 = new LinkedList<>(); //here only one by one we can go, from one element (0) to next one (1)
        names.add(10);
        names.add(20);
        names.add(44);
        names.add(50);
        names.add(100);
        System.out.println(names);
        names.add(1,600);
        System.out.println(names);
        names.remove(2);
        System.out.println(names); //we should use a linked list not array list in this case


        long start = System.currentTimeMillis();
        List <Integer> numbers = new ArrayList <> ();
        for (int i = 0; i<100000 ; i++) {
            numbers.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
