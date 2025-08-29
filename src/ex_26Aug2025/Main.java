package ex_26Aug2025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(27));
        int a = 1;
        int b = 2;
        int z = -3;
        System.out.println(Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(z)));

        int first = 20;
        double second = 9.99;
        int sumoffirstandsecond = first + (int)second;
        System.out.println(sumoffirstandsecond);

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.print(name);


    }
}
