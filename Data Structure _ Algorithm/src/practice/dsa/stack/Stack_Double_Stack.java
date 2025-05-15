package practice.dsa.stack;

public class Stack_Double_Stack {
    int arr[];
    int top1,top2;
    Stack_Double_Stack(int size){
        arr = new int[size];
        top1 = -1;
        top2 = arr.length;
    }
    public void push1(int val) {
        if(top1==top2-1){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top1] = val;
        System.out.println("Pushed "+val);
    }
    public void push2(int val) {
        if(top2 == top1 +1){
            System.out.println("Stack overflow");
            return;
        }
        arr[--top2] = val;
        System.out.println("Pushed "+val);
    }
    public int pop1() {
        if(top1==-1){
            System.out.println("Stack underflow");
            return 0;
        }
        return arr[top1--];
    }
    public int pop2() {
        if(top2==arr.length){
            System.out.println("Stack underflow");
            return 0;
        }
        return arr[top2++];
    }
    public int peek1(){
        if(top1==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top1];
    }
    public int peek2(){
        if(top2==arr.length){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top2];
    }
}
