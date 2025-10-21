package collectionFramework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Oct14Part2 {
    public static void main(String[] args) {
        //Student - name, ID
        Student s1 = new Student("Shubham", 1);
        Student s3 = new Student("Satyam",3);
        Student s2 = new Student("Shivam", 2);

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s3);
        al.add(s2);
        System.out.println(al);
 //       Collections.sort(al);
        Collections.sort(al, new SortById());
        System.out.println(al);
        Collections.sort(al, new SortByName());
        System.out.println(al);

    }
}
class Student implements Comparable<Student>{
    private String name;
    private Integer ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public Student(String name, Integer ID) {
        this.name = name;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }

//    @Override
//    public int compareTo(@NotNull Student o) {
//        return Integer.compare(this.ID, o.ID);
//    }
    @Override
      public int compareTo(@NotNull Student o) {
         return CharSequence.compare(this.name, o.name);
    }

}

class SortById implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getID(),o2.getID());
    }
}
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}