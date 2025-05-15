package practice.dsa.stack;

public class StackDS {
    int arr[] , top ;
    public StackDS(int size) {
        arr= new int[size];
        top=-1;
    }
    public  boolean isFull() { return top == arr.length - 1;}
    public boolean isEmpty() { return top == -1;}
    public void push(int val) {
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = val;
    }
    public int pop() {
        if(isEmpty()) {
//            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }
    public int peek() {
        if(isEmpty()) {
//            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}
