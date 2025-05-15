package Practice.Functional_Interface.Example;

@FunctionalInterface
interface ex1 {
    //void method1();
    void print();

    default void print2() {
        System.out.println("Print method 2");
    }

    default void print3() {
        System.out.println("Print method 3");
    }

    default void print4() {
        System.out.println("Print method 4");
    }

    static void print5() {
        System.out.println("Print method 5 static");
    }

    static void print6() {
        System.out.println("Print 6 calling private static");
        print7();
        System.out.println("Print method 6 static");
    }

    private static void print7() {
        System.out.println("Print method 7 private");
    }
}

