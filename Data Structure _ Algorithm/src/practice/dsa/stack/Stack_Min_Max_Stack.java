package practice.dsa.stack;

public class Stack_Min_Max_Stack {
    StackDS stk = new StackDS(10);
    StackDS minStk = new StackDS(10);
    StackDS maxStk = new StackDS(10);
    public void push(int val) {
        stk.push(val);
        if(val < minStk.peek() || minStk.isEmpty()){
            minStk.push(val);
        }
        if(val > maxStk.peek() || maxStk.isEmpty()){
            maxStk.push(val);
        }
        System.out.println("Pushed: " + val);
    }
    public int pop() {
        int poped = stk.pop();
        if(poped == minStk.peek()){
            minStk.pop();
        }
        if(poped == maxStk.peek()){
            maxStk.pop();
        }
        System.out.println("Popped: " + poped);
        return poped;
    }
    public int peek(){
        return stk.peek();
    }
    public int getMin(){
        return minStk.peek();
    }
    public int getMax(){
        return maxStk.peek();
    }
}
