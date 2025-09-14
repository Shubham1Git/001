package ex_26Aug2025;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Sept3_Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year");
        if(!sc.hasNextInt()){
            System.out.println("Please enter valid input");
        }else{
            int year = sc.nextInt();
            if(year >=4){
                if(year%4==0){
                    String yr = ((year%400)==0) ? "It is leap year":(((year%100)==0)?"It is not leap year":"It is leap year");
                    System.out.println(yr);
                }else{
                    System.out.println("It is not leap year");
                }
            }else{
                System.out.println("It is not leap year");
            }
        }


    }
}
