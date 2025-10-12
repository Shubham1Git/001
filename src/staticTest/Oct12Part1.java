package staticTest;

public class Oct12Part1 {
    public static void main(String[] args) {
        System.out.println(PAGES.HOMEPAGE);  //
        System.out.println(APIConstants.LOGIN_PAGE);
        System.out.println(APIConstants.LOGIN_PAGE.getValue());
        A a = new A();
        System.out.println(a.num2);
        System.out.println(A.num);

        A b = new A();
    }
}
class A{
    static int num = 10;
    int num2 = 11;
    static {
        System.out.println("Static method");
        System.out.println(num);
    }
    {
        System.out.println("Instance Initialization block");
        System.out.println(num2);
    }
}