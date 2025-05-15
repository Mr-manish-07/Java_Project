package Practice.Functional_Interface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    public int marks;
    int roll;
    String name;
    public Student(int rool, String name) {
        this.roll = rool;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rool=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}

class sortByRoll implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.roll - s2.roll;
    }
}

public class compartor_class {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(111, "Mayank"));
        students.add(new Student(131, "Anshul"));
        students.add(new Student(121, "Solanki"));
        students.add(new Student(101, "Aggarwal"));
        Collections.sort(students, new sortByRoll());
        System.out.println("Sort by Roll");
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }

}
