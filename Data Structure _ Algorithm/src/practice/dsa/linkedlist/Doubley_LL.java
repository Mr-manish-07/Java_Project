public class Doubley_LL {
    int data;
    Doubley_LL prev, next, head, tail;
    int size;

    public Doubley_LL createDLL(int data) {
        Doubley_LL dll = new Doubley_LL();
        dll.data = data;
        dll.prev = null;
        dll.next = null;
        head = dll;
        tail = dll;
        size = 1;
        return head;
    }

    public void insertElement(int data, int location) {
        if (head == null) {
            head = createDLL(data);
            System.out.println("Linked List was Empty,but Linked List is created by given value");
            return;
        }
        Doubley_LL node = new Doubley_LL();
        node.data = data;
        if (location == 0) {
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.prev = tail;
            node.next = null;
            tail = node;
        } else {
            Doubley_LL temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            node.prev = temp;
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
        }
        size++;
    }

    public void traverseLL() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Doubley_LL temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.data);
                if (i != size - 1) {
                    System.out.print("->");
                }
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void searchLL(int value) {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Doubley_LL temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.data == value) {
                    System.out.println("Value found at index " + i);
                    return;
                }
                temp = temp.next;
            }
            System.out.println("Value not found");
        }
    }

    public int deleteNode(int location) {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return -1;
        }
        Doubley_LL temp = head;
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
        return extraTemp;
    }
    public void completeDelete(){
        head=tail=null;
        System.out.println("Linked List deleted");
    }
}
