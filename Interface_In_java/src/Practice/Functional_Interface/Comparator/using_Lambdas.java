package Practice.Functional_Interface.Comparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Define the Student class
class Student3 {
    String name;
    Integer age;

    // Constructor
    Student3(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}


    public Integer getAge() {return age;}

    // Method to print student
    // details in main()
    @Override
    public String toString() {
        return name + " : " + age;
    }
}

// -----------------------  THIS METHOD CAN BE SKIP DUE TO LAMBDAS EXPRESSION USE

//class SortingByBoth2 implements Comparator<Student3> {
//    public int compare(Student3 s1, Student3 s2) {
//        int NumberSort = s1.getName().compareTo(s2.getName());
//        int AgeSort = s1.getAge().compareTo(s2.getAge());
//        return NumberSort == 0 ? AgeSort : NumberSort;
//    }
//}

// --> This class compares Name first if name is same then it sort by age;

class compareTo2 {
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

        students.sort(Comparator.comparing(Student3::getName).thenComparing(Student3::getAge));
        //---->   This method is comparing student by name first if same then move to
        //---->   age for compasrsion

        System.out.println("---> After sorting <----");
        for (Student3 s : students) {
            System.out.println(s);
        }
    }
}
