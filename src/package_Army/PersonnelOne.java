package package_Army;

public class PersonnelOne {
    public int terroristKillCountinValley = 9999;
    private int terroristKilledbyOne = 99;
    protected int terroristKilledbyUnit = 999;
    private void shootAtSight(){
        System.out.println("Shoot at sight");
    }

    public static void main(String[] args) {
        PersonnelOne p1 = new PersonnelOne();
        System.out.println(p1.terroristKilledbyUnit);
    }

    public void shoot(){
        PersonnelOne p2 = new PersonnelOne();
        System.out.println(p2.terroristKilledbyUnit);
        p2.shootAtSight();
    }
}