package practice.dsa.Recursion;

public class Fibonacci_Series {
    public int fibonacci(int n) {
        if(n == 0 || n==1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
