package Practice.Examples;

// Interface Declared


interface testInterface {

    // public static and final
    int VALUE = 10;

    // public and abstract
    void display();
    void printDay();
}

// Class implementing interface
class TestClass implements testInterface {

    // Implementing the capabilities of
    // Interface
    public void display(){
        System.out.println("In test class");
    }
    public void printDay(){
        System.out.println("In test class");
    }
}

public class ex1



{
    public static void main(String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        t.printDay();
        System.out.println(t.VALUE);
    }

}
