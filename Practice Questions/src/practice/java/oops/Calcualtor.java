package practice.java.oops;

public class Calcualtor {

    public  void add(int a,int b){
        System.out.println("Adding "+a+" "+b + " is : " +(a+b));
    }
    public  void add(double a,int b){
        System.out.println("Adding "+a+" "+b + " is : " +((int)a+b));
    }
    public  void add(int a,double b){
        System.out.println("Adding "+a+" "+b + " is : " +(a+(int)b));
    }
    public  void add(double a,double b){
        System.out.println("Adding "+a+" "+b + " is : " +(a+b));
    }
    public  void add(int a,int b , int c){
        System.out.println("Adding "+a+" "+b +" "+ c+" is : " +(a+b+c));
    }





    public static void main(String[] args) {
        Calcualtor calc = new Calcualtor();
        calc.add(1,2);
        calc.add(2.1,3);
        calc.add(3,4.5);
        calc.add(5.5,6.9);
        calc.add(7,8,5);
    }
}
