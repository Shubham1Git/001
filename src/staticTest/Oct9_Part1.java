package staticTest;

public class Oct9_Part1 {
    public static void main(String[] args) {
        // Wrapper class
        // Class whose object wraps or contains primitive data types
        // They convert primitive data types into objects
        int a = 10;
        Integer b = a;
        System.out.println(b.equals(a));

        Integer c = 1;  // Auto boxing
        int d = c;      // Un boxing

        String e = "11";
        Integer f = Integer.valueOf(e);
        System.out.println(f);
    }
}