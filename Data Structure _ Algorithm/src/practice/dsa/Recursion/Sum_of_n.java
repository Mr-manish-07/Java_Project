package practice.dsa.Recursion;

public class Sum_of_n {
    public int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
}
