package Practice.Functional_Interface.Example;

@FunctionalInterface
public interface lambdaEx1 {
    //    void start();
    double calculate(int x, int y);

    static void print() {
        System.out.println("Practice functional interface static");
    }

    default void print2() {
        System.out.println("Practice functional interface default");
    }

    default void print3() {
        System.out.println("Practice functional interface lambda default ");
    }
}

interface D {
    void run();

    default void print2() {
        System.out.println("Practice functional interface dynamic ");
    }
}

class Curd {
    public static void main(String[] args) {
        D d = () -> System.out.println("Hello World");
        d.run();
    }
}

