package collectionFramework;

import java.util.*;

public class Oct18Part3Map {
    public static void main(String[] args) {
        // Map -> Key value pair
        Map<String, String> m1 = new HashMap();
        // Map m1 = new LinkedHashMap();
        // Map m1 = new TreeMap();
        // Map m1 = new WeakHashMap();

        m1.put("rollNo","1");
        m1.put("name","Shubham");
        System.out.println(m1);
        System.out.println(m1.get("name"));
        System.out.println(m1.values());

        //Iterating over the map
        for(Map.Entry<String,String> item: m1.entrySet()){
            System.out.println(item.getKey() + " -> " + item.getValue());
        }
    }
}