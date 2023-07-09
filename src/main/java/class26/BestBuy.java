package class26;

import java.util.HashMap;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args) {
        Map<Integer, String> bestBuy = new HashMap<>();
        bestBuy.put(1234,"MacBook");
        bestBuy.put(2344,"Ipad");
        bestBuy.put(3344,"Iphone 14 Plus");
        bestBuy.put(5674,"AirPods");
        bestBuy.put(4324,"Ipod");


        for (Map.Entry<Integer, String> e : bestBuy.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }
}}
