package Practice.Examples;

interface ex7 {
    // Private method for internal use
    private void startEngine() {
        System.out.println("Engine started.");
    }

    // Default method that uses the private method
    default void drive() {
        // Calls the private method
        startEngine();
        System.out.println("Vehicle is now driving.");
    }
}

class Car implements ex7 {
    public void startEngine() {

    }
    // Car class implements Vehicle interface and inherits the default method 'drive'
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // This will call the default method, which in turn calls the private method
        car.drive();
    }
}

