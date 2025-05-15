public class Doubly_Circular_LL {
    int data,size;
    Doubly_Circular_LL head,tail,next,prev;
    public void createLL(int data) {
        Doubly_Circular_LL node = new Doubly_Circular_LL();
        if(head == null) {
            node.data = data;
            node.prev = null;
            node.next = null;
            head=tail=node;
            size=1;
            System.out.println("Created Circular Doubly LL ");
            System.out.println("null <- "+node.data +" -> null");
            return;
        }
        System.out.println("Can't create again");
    }
    public void insertVal(int data,int location) {
        if(location< 0){
            System.out.println("Invalid location");
            return;
        }
        if (head == null) {
            System.out.println("No list is present we are creating a list");
            createLL(data);
            return;
        }
        Doubly_Circular_LL node = new Doubly_Circular_LL();
        node.data = data;
        if(location==0) {
            node.prev = head.prev;
            node.next = head;
            head.prev = node;
            head = node;
            tail.next = head;
        }else if(location >= size) {
            node.prev = tail;
            node.next = tail.next;
            tail.next = node;
            tail=node;
            head.next = tail;
        }else{
            Doubly_Circular_LL temp = head;
            for(int i=0; i<location-1; i++) {
                temp = temp.next;
            }
            node.prev = temp;
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
        }
        System.out.println("Value inserted successfully");
        size++;
    }
    public void traverseLL() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Doubly_Circular_LL temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.data +"->");
                temp = temp.next;
            }
            System.out.print(head.data +"(Head)\n");
        }
    }
    public boolean searchNode(int value){
        if(head!=null){
            Doubly_Circular_LL temp = head;
            for (int i = 0; i < size; i++) {
                if(temp.data==value){
                    System.out.println ("Value found at index "+ i);
                    return  true;
                }
                temp = temp.next;
            }
        }
        System.out.println ("Element Not found");
        return false;
    }
    public int deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }
        Doubly_Circular_LL temp = head;
        int extraTemp=0;
        if (location == 0) {
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev=null;
            }
        } else if (location >= size) {
            extraTemp = temp.data;
            tail = tail.prev;
            tail.next = null;
        } else {
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            extraTemp = temp.next.data;
            temp.next = temp.next.next;
            temp.next.prev = temp;
        }
        size--;
        System.out.println("Value deleted successfully : " + extraTemp);
        return extraTemp;
    }
}
