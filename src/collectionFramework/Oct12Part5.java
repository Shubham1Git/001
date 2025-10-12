package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oct12Part5 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Mr. Kuldeep Singh");
        myList.add("Mrs. Indu Rauthan");
        myList.add("Shubham");
        myList.add("Shubhanshi");
        myList.add("Shivam");

        System.out.println("Method 1 to print all elements");
        for(String str: myList){
            System.out.println(str);
        }

        System.out.println("Method 2 to print all elements");
        for(int a = 0; a<myList.size(); a++){
            System.out.println(myList.get(a));
        }


        System.out.println("Method 3 to print all elements");
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
