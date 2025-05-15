public class Chaining {

    //Chaining is the way of calling the another constructor
    // by the help of this keyword

    private String name, category, gender;

    private int age, rollNO, uniqueId, yearOfBirth;

    public Chaining(String name, String category, int age, int rollNO) {

        this.name = name;

        this.category = category;

        this.age = age;

        this.rollNO = rollNO;
    }

    public Chaining(String gender, int uniqueId) {
        this(2005);
    }

    public Chaining(int yearOfBirth) {
        this("Manish", "OBC", 19, 2351231);
        this.yearOfBirth = yearOfBirth;
    }


    public static void main(String[] args) {

//        Chaining obj1 = new Chaining("Manish","General",18,2351231);

        Chaining obj2 = new Chaining(2005);

        System.out.println("Name is " +obj2.name+" year of birth is  "+obj2.yearOfBirth);

    }

    @Override
    public String toString() {
        return "Chaining{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", rollNO=" + rollNO +
                ", uniqueId=" + uniqueId +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
