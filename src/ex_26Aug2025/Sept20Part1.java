package ex_26Aug2025;

public class Sept20Part1 {
    public static void main(String[] args) {
        Polomorph ops = new Polomorph();
        int res = ops.add(2,3);
        System.out.println(res);
        double re = ops.add(23.1,3);
        System.out.println(re);
        String resu = ops.add("Test","Best");
        System.out.println(resu);

        GermanShephard gs = new GermanShephard();
        gs.bark();
        Dog dg = new Dog();
        dg.bark();

        Dog dgs = new GermanShephard();
        dgs.bark();
    }
}