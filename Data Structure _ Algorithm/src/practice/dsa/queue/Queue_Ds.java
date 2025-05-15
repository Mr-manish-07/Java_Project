package practice.dsa.queue;

public class Queue_Ds {
    int[] arr;
    int front, rear;
    Queue_Ds(int size) {
        arr = new int[size];
        front=rear=-1;
    }
    public boolean isEmpty() {return front == rear-1;}
    public boolean isFull() {return front == arr.length-1;}
    public void enqueue(int data) {
        if(!isFull()) {
            rear = 0;
            arr[++front] = data;
            System.out.println("Value enqueued: " + data);
            return;
        }
        System.out.println("Queue is Full");
    }

    public int dequeue() {
        if(!isEmpty())
            return arr[rear++];

        return -1;
    }

    public int peek() {
        if(!isEmpty())
            return arr[front];
        return -1;
    }

    public void deleteQueue() {
        front=rear=-1;
        System.out.println("Queue is Deleted");
    }

    public void printQueue() {
        for(int i=rear;i<=front;i++){
            System.out.print(arr[i]);
            if(i!=front){
                System.out.print(" > ");
            }
        }
    }
}
