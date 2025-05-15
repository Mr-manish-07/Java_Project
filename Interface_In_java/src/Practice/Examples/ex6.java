package Practice.Examples;
interface ex6
{
    final int a = 10;
    static void display()
    {
        System.out.println("hello");
    }
}

// A class that implements the interface.
class anotherClass implements ex6
{
    // Driver Code
    public static void main (String[] args)
    {
        ex6.display();
    }
}

