package staticTest;

public class Sept29Part1 {
    public static void main(String[] args) {

        System.out.println(ATB.courseName);
        ATB a1 = new ATB("Shubham");
        System.out.println(a1.getName());

        ATB a2 = new ATB("Satyam");
        System.out.println(a2.getName());

        ATB.assignment();
    }
}

class ATB{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static String courseName = "ATB";
    static void assignment(){
        System.out.println("Assignment list");
    }
}
