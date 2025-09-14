package ex_26Aug2025;

import java.util.Scanner;

public class Person {
    String name;
    int emp_id;
    Person(){
        System.out.println("Enter person name");
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();

        System.out.println("Enter employee ID");
        this.emp_id = sc.nextInt();
    }
    void sleep(){
        System.out.println("Take good sleep of 6 to 8 hours.");
    }
    void walk(){
        System.out.println("Walk atleast 10 thousand steps daily.");
    }
    void talk(){
        System.out.println("Less talk and more work!");
    }
}
