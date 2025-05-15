package Practice.Functional_Interface.Example;

@FunctionalInterface
public interface ex2 {
    void print();
}

class B implements ex2 {
    public void print() {
        System.out.println("Print method B");
    }
}

class C {
    public static void main(String[] args) {
        ex2 c = new ex2() {
            public void print() {
                System.out.println("Print method c");
            }
        };
        B b = new B();
        b.print();
        c.print();
    }
}
