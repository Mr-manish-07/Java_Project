package practice.java.oops;

public class Animal {
    public void makesSound() {
        System.out.println("Make sound");
    }

    public static void main(String[] args) {
        Cat cat  = new Cat();
        cat.makesSound();
        Dog dog = new Dog();
        dog.makesSound();
    }
}
class Cat extends Animal {
    @Override
    public void makesSound() {
        super.makesSound();
        System.out.println("Cat makesSound");
    }
}
class Dog extends Animal {
    @Override
    public void makesSound() {
        super.makesSound();
        System.out.println("Dog makesSound");
    }
}
