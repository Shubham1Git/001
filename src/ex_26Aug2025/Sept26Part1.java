package ex_26Aug2025;

public class Sept26Part1 {
    public static void main(String[] args) {
        BHK_Type2 bh = new BHK_Type2();
        bh.display();

    }
}

class House{
    public int room = 1;
    House(){
        System.out.println("House");
    }
    void message(){
        System.out.println("Generic message");
    }
}

class BHK_Type2 extends House{
    private int room = 2;
    BHK_Type2(){
        super();
    }
    public void display(){
        System.out.println("My class i.e. this class room count: " + this.room);
        System.out.println("Parent class i.e. super class room count: " + super.room);
    }
}

class BHK_Type3{

}