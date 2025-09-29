package package_Army;

import java.sql.SQLOutput;

public class PersonnelTwo extends PersonnelOne{
    public static void main(String[] args) {
        PersonnelOne p2 = new PersonnelOne();
        System.out.println(p2.terroristKilledbyUnit);
        System.out.println(p2.terroristKillCountinValley);
        p2.shoot();

    }
}
