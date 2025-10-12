package staticTest;

import java.util.Scanner;

public class Oct12Part4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if(name.equalsIgnoreCase("Shubham")){
            try {
                throw new Exception ("Not Allowed!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else{
            System.out.println("Allowed");
        }
    }
}