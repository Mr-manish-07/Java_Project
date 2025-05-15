public class Overloading {
    private String name;
    private  int age,rollNo,yearOfBirth;

    public Overloading (){
        System.out.println("Constructor with no parameters");
    }


    public Overloading (int age, int yearOfBirth){
        this.age=age;
        this.yearOfBirth=yearOfBirth;
        System.out.println("Constructor with 2 parameters");
    }

    public Overloading(int age, int rollNo, int yearOfBirth,String name) {
        this.age = age;
        this.rollNo = rollNo;
        this.yearOfBirth = yearOfBirth;
        System.out.println("Constructor with 3 parameters");
    }



    // Same constructor with different parameter called contractor overloading




    public static void main(String[] args) {

        // All contractor is called

        Overloading obj1 = new Overloading();
        Overloading obj2 = new Overloading(19,2005);
        Overloading obj3 = new Overloading(19,2351234,19,"Manish");
        System.out.println("____________________________");

        // let's excess private value of the instance variable

        // Obj1 has no value passed so default value will be printed (int 0, double 0.00, String NULL)
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj2.age + " "+obj2.yearOfBirth);
        System.out.println(obj3);
    }












    @Override
    public String toString() {
        return "Overloading{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", yearOfBirth=" + yearOfBirth +
                ", name ="+name+
                '}';
    }
}
