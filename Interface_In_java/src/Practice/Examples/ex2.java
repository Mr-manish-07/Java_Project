package Practice.Examples;
interface Vehicle {

    // Abstract methods defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    default void printStates(){
        System.out.println("Empty body");
    };
}

// Class implementing vehicle interface
class Bicycle implements Vehicle{

    int speed=10;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed +"km/h"
                + " gear: " + gear);
    }
}

// Class implementing vehicle interface
class Bike implements Vehicle {

    int speed=40;
    int gear;

    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }

    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }

    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed +"km/h"
                + " gear: " + gear);
    }

}

public class ex2
{
    public static void main (String[] args)
    {

        // Instance of Bicycle(Object)
        Bicycle bicycle = new Bicycle();

        bicycle.changeGear(4);
        bicycle.speedUp(5);
        bicycle.applyBrakes(2);

        System.out.print("Bicycle present state : ");
        bicycle.printStates();

        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(40);
        bike.applyBrakes(10);

        System.out.print("Bike present state : ");
        bike.printStates();
    }
}

