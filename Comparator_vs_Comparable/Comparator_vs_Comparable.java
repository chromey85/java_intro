import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    // @Override
    // public int compareTo(Student that) {
    // if (this.age > that.age) {
    // return 1;
    // } else {
    // return -1;
    // }
    // }

}

public class Comparator_vs_Comparable {
    public static void main(String[] args) {

        Comparator<Student> com = (i, j) ->
        // if (i.age > j.age) {
        // return 1;
        // } else {
        // return -1;
        // }

        i.age > j.age ? 1 : -1;

        // List<Integer> studs = new ArrayList<>();
        // studs.add(43);
        // studs.add(31);
        // studs.add(72);
        // studs.add(29);

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(38, "Yusuf"));
        studs.add(new Student(37, "Nicola"));
        studs.add(new Student(8, "Gabriel"));
        studs.add(new Student(4, "Jasmine"));

        Collections.sort(studs, com);

        for (Student s : studs) {
            System.out.println(s);
        }

        System.out.println("PRINT ALL: " + studs);

    }
}