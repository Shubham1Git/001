package collectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Oct12Part4 {
    public static void main(String[] args) {
        //Collection Framework
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Mr. Kuldeep Singh");
        myList.add("Mrs. Indu Rauthan");
        myList.add("Shubham");
        myList.add("Shubhanshi");
        myList.add("Shivam");
        System.out.println(myList);
        System.out.println(myList.contains("Shivam"));
        System.out.println(myList.size());
//        myList.remove("Shivam");
//        System.out.println(myList.size());
        myList.set(4,"Satyam");
        System.out.println(myList);
    }
}