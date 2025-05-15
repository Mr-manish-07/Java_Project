public class Main{

    public static void main(String[] args) {
//        Animal ani = new Animal("Jerman","5 Feet",8);
//        animalWorking(ani,"30");
//
//        Dog dog = new Dog();
//        animalWorking(dog,"25");
//
//        Dog dog1 = new Dog("Asian",13);
//
//         Dog dog2 = new Dog("Saudi",10,"curled","round");
//
//        animalWorking(dog1,"23");
//        animalWorking(dog2,"25");
        
        SalariedEmployee salariedEmployee = new SalariedEmployee ("Manish","20/20/20","4/4/4",true,2000.50);
        System.out.println (salariedEmployee.toString ());        
        
    }

    public static void animalWorking(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed + " km/h");
        System.out.println(animal);
        System.out.println(" ______________________");
    }

}