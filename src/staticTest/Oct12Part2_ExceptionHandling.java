package staticTest;

public class Oct12Part2_ExceptionHandling {
    public static void main(String[] args) {
        int b = 0;
        try {
            String i = args[0];
            int a = Integer.parseInt(i);
            b = a/0;
        } catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error message: " + e.getMessage());
        }
        System.out.println(b);
    }
}
