package practice.java.oops;

public class Shape {
    public void area(){
        System.out.print("Area of " + getClass().getSimpleName()+" is : ");
    }

    public static void main(String[] args) {
        circle circle = new circle(5);
        Rectangle rectangle = new Rectangle(4,8);
        man man = new man();
        circle.area();
        rectangle.area();
        try {
            Shape Rectangle = null;
            if(Rectangle instanceof Shape){
                System.out.println("do");
            }else {
                System.out.println("not do");
            }
        }catch (Exception e){
            System.out.println("do nothing");
        }
    }

}
class circle extends Shape {
    int radius;
    int area;
    circle(int radius) {
        this.radius = radius;
        area = 3 * (this.radius * this.radius);
    }

    @Override
    public void area() {
        super.area();
        System.out.println(area);
    }
}
class Rectangle extends Shape {
    int l,b;
    int area;
    Rectangle(int l,int b) {
        this.l= l;
        this.b = b;
        area = l*b;
    }

    @Override
    public void area() {
        super.area();
        System.out.println(area);
    }
}
class man{

}

