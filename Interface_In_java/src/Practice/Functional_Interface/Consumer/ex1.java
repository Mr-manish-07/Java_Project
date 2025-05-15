package Practice.Functional_Interface.Consumer;

import java.util.function.Consumer;

class A{

}
//class B implements Consumer<B>{
//    public void accept(B a){
//        System.out.println("B is "+a);
//    }
//}


public class ex1  {
    public static void main(String[] args) {
        Consumer<Integer> c = System.out::println;
        Consumer<Integer> c1 = System.out::println;
        c.andThen(c1).accept(1);

    }
}
