package Practice.Functional_Interface.Example;

class Geeks {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("New thread created")).start();
    }
}

