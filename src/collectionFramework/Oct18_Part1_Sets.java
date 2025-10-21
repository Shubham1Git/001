package collectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Oct18_Part1_Sets {
    public static void main(String [] args){
        // List -> Duplicate values are allowed
        // Set -> Doesn't allow duplicates
        // There are 3 types of sets

        Set hs = new HashSet(); // Uses hashing mechanism to store elements, and no order is present. null can be added
        Set lhs = new LinkedHashSet(); // Linked list machanism is used and order maintained. null can be added
        Set ts = new TreeSet(); // Black and Red tree mechanism is used and Automatic sorting is performed. null cannot be added

        hs.add("Apple");
        hs.add("Orange");
        hs.add("Banana");
        System.out.println(hs);

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Banana");
        System.out.println(lhs);

        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        System.out.println(ts);

        for(Object s: ts){
            System.out.println(s);
        }
    }
}
