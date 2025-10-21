package collectionFramework;

import java.util.Stack;

public class Oct14Part1 {
    public static void main(String [] args){
        Stack s = new Stack();
        s.push("Shubham");
        s.push("Shivam");
        s.add("Stack last");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
}
