package practice.dsa.queue;

public class Queue_Circular_Array {
    public int[] arr;
    public int front,rear;
    public Queue_Circular_Array(int size){
        arr=new int[size];
        front=rear=-1;
    }
    public boolean isFull() {
        if(rear == 0 && front == arr.length-1)
            return true;
        if(rear == front+1)
            return true;
        return false;
    }

    public void enQueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(front==arr.length-1){
            front=(front+1)%arr.length;
            arr[front]=val;
            System.out.println("Value Inserted: "+val);
            return;
        }
        if(front==-1){
            rear=0;
        }
        arr[++front]=val;
        System.out.println("Value Inserted: "+val);
    }
    public int deQueue() {
        int value;
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        value=arr[rear];
        arr[rear]=Integer.MIN_VALUE;
        if(front == rear)
            front = rear=-1;
        else if(rear==arr.length-1)
            rear = 0;
        else
            rear++;
        return value;
    }
    public int peek(){
        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[rear];
    }
    public void deleteQueue(){
        if(front==-1){
            System.out.println("Queue already empty");
            return;
        }
        front=rear=-1;
        System.out.println("Queue is Empty Now");
    }
    public void removeMemoryOfArray(){
        arr=null;
        System.out.println("Queue is fully deleted, If need to create again call constructor");
    }
}
