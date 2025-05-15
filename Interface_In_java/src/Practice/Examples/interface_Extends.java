package Practice.Examples;

interface A {
    void method1();
    void method2();
}

// B now includes method1
// and method2
interface B extends A {
    void method3();
}

// the class must implement
// all method of A and B.
class GFG implements B
{
    public void method1() {
        System.out.println("Method 1");
    }

    public void method2() {
        System.out.println("Method 2");
    }

    public void method3() {
        System.out.println("Method 3");
    }
}
class anotherGFG extends GFG {
    public void method4() {
        System.out.println("Method 4");
    }
    public static void main(String[] args) {
        GFG gfg = new GFG();
        gfg.method1();
        gfg.method2();
        gfg.method3();
    }

}