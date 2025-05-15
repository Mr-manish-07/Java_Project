package Practice.Functional_Interface.Comparator;

import java.util.*;

// Define the Student class
class Student2 {
    String name;
    Integer age;

    // Constructor
    Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // Method to print student
    // details in main()
    @Override
    public String toString() {
        return name + " : " + age;
    }
}

class SortingByBoth implements Comparator<Student3> {
    public int compare(Student3 s1, Student3 s2) {
        int NumberSort = s1.getName().compareTo(s2.getName());
        int AgeSort = s1.getAge().compareTo(s2.getAge());
        return NumberSort == 0 ? AgeSort : NumberSort;
    }
}

public class compareTo {
    public static void main(String[] args) {
        List<Student3> students = new ArrayList<Student3>();
        students.add(new Student3("Mary", 32));
        students.add(new Student3("John", 23));
        students.add(new Student3("Jane", 24));
        students.add(new Student3("Jack", 25));
        students.add(new Student3("Jill", 26));
        students.add(new Student3("Bob", 27));
        students.add(new Student3("Manish", 28));
        students.add(new Student3("Mary", 29));
        students.add(new Student3("Abhishek",32));

        System.out.println("-----> Before sorting <-----");
        for (Student3 s : students) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");

        SortingByBoth sortingByBoth = new SortingByBoth();
        Collections.sort(students, sortingByBoth);
        System.out.println("---> After sorting <----");
        for (Student3 s : students) {
            System.out.println(s);
        }
    }
}