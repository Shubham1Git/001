package staticTest;
// InnerClassStudy
public class InnerClassStudy {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.OC_M1();

        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.IC_M1();

    }
}

class OuterClass{
    Integer a = 10;
    void OC_M1() {
        System.out.println("Outer class method 1" + a);
    }
    class InnerClass{
        Integer b = 11;
        void IC_M1(){
            System.out.println("Inner class method 1" + b);
        }
    }
}