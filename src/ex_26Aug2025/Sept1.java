package ex_26Aug2025;

import java.util.Arrays;
import java.util.Scanner;

public class Sept1 {
    public static void main(String[] args) {

//  **** Enter program to ask user to enter marks of 5 subjects and output the same
//        Scanner sc = new Scanner(System.in);
//        float total = 0;
//        float[] marks = new float[5];
//        for(int i=0; i<marks.length; i++){
//            System.out.println("Please enter marks for subject " + (i+1));
//            marks[i] = sc.nextFloat();
//            total += marks[i];
//        }
//        float avg = total / marks.length;
//        System.out.println(avg);

        int[] salaries = {7,12,4,6,25,21,4,23,75};
//  **** From the array of salaries, find the max and min salary
//  Method 1
//        int mx = 1;
//        int mn = 100;
//        for(int i=1; i<salaries.length; i++){
//            if(salaries[i] > mx){
//                mx = salaries[i];
//            }
//            if(salaries[i] < mn){
//                mn = salaries[i];
//            }
//        }
//        System.out.println(mx);
//        System.out.println(mn);

//  Method 2 -> Sort the array and find the min and max salary
//        Arrays.sort(salaries);
//        System.out.println(salaries[salaries.length-1]);
//        System.out.println(salaries[0]);

//  **** From the array of salaries, find the second max salary
//  Method 1
    int mx = 1;
    int secmx = 1;
    int a=0;
        for(int i=1; i<salaries.length; i++){
            if(salaries[i] > mx){
                mx = salaries[i];
                a=i;
            }
        }
        for(int i=0; i<salaries.length; i++){
            if((salaries[i]>secmx)&&(i!=a)){
                secmx = salaries[i];
            }
        }
        System.out.println(secmx);
    }
}