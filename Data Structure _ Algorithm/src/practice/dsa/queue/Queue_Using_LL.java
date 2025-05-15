package practice.dsa.queue;
import practice.dsa.linkedlist.Singly_LL;

public class Queue_Using_LL {
    Singly_LL ll;
    Queue_Using_LL() {
        ll = new Singly_LL();
        System.out.println("Creating new Queue_Using_LL");
    }

    public void enQueue(int value) {
        if(ll.head == null){
            ll.insertEle(value,0);
            System.out.println("Inserted value : "+value);
            return;
        }
        ll.insertEle(value,ll.size);
        System.out.println("Inserted value : "+value);
    }
    public int deQueue() {
        if(ll.head==null){
            System.out.println("Queue is empty");
            return -1;
        }
        if(ll.tail.next == ll.head){return -1;}
        return ll.deleteNode(0);
    }
    public int peek(){
        if(ll.head==null){
            System.out.println("Queue is empty");
            return -1;
        }
        return ll.head.value;
    }


}
