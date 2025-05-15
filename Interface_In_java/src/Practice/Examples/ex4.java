package Practice.Examples;

// interfaces can have methods from JDK 1.8 onwards
interface TestInterface
{
    int VALUE = 10;

    default void display() {
        System.out.println("hello");
    }
}

// A class that implements the interface.
public class ex4 implements TestInterface
{
    @Override
    public void display() {
        System.out.println("Inside main function");
    }
    // Driver Code
    public static void main (String[] args) {
        ex4 t = new ex4();
        System.out.println(TestInterface.VALUE);
        t.display();
    }
}


