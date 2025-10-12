package staticTest;
public class AnonymousClassStudy {
    public static void main(String[] args) {
        ABC ab = new ABC() {            //Anonymous class for interface ABC
            @Override
            public void m1() {
                System.out.println("m1");
            }
            @Override
            public void m2() {
                System.out.println("m2");
            }
        };
        ab.m1();
        ab.m2();


        DEF de = new DEF() {     //Anonymous class for abstract class DEF
            @Override
            void m3() {
                System.out.println("m3");
            }
        };
        de.m3();


    }
}
interface ABC{
    void m1();
    void m2();
}

abstract class DEF{
    abstract void m3();
}