package practice.dsa.stack;
import practice.dsa.linkedlist.Singly_LL;

public class Stack_Using_LL {
    Singly_LL ll;
    public Stack_Using_LL() {
        ll = new Singly_LL();
    }
    public void push(int data) {
        ll.insertEle(data,0);
        System.out.println("Pushed: " + data);
    }
    public int pop() {
        int result = -1;
        if(ll.head == null){
            System.out.println("Stack is empty");
        }else{
            result = ll.deleteNode(0);
        }
        return result;
    }
    public int peek() {
        if(ll.head == null){
            return 0;
        }
        return ll.head.value;
    }

}
