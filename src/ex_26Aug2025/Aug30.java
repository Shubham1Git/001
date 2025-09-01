package ex_26Aug2025;

import java.util.Scanner;

public class Aug30 {
    public static void main(String[] args) {
        System.out.println("Hello");
        int[] nums = new int[2];
        int[] num = {0,1,2,3};
        System.out.println(nums[1]);
        System.out.println(num[2]);
        for(int i = 0; i<num.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter # of your choice!");
            num[i] = sc.nextInt();
            //int a = i+1;
            System.out.println("Number " + (i+1) + " entered by user is " + num[i]);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);



    }
}
