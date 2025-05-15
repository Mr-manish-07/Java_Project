package practice.java.oops;

public class Student {
    private int id;
    private String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("ID: " + id+" Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        Student s2 = new Student(2, "Jane");
        s1.display();
        s2.display();
    }
}
