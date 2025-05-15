public class Singly_LL_Circular {
    int data, size;
    Singly_LL_Circular head, tail,next;

    public Singly_LL_Circular createNode(int data) {
        if(head == null){
            Singly_LL_Circular node = new Singly_LL_Circular();
            node.data=data;
            node.next = null;
            head=tail=node;
            size=1;
            System.out.println("linked List Created \n" + data +" -> Null");
            return head;
        }
        System.out.println("Linked list can't be created again");
        return null;
    }


    public void insertVal (int data,int location) {
        if(location<0){
            System.out.println("Invalid location");
            return;
        }
        if(head == null){
            createNode(data);
            return;
        }
        Singly_LL_Circular node = new Singly_LL_Circular();
        node.data = data;
        if(location == 0){
            node.next = head;
            head=node;
            tail=head;
        }else if(location >= size){
            tail.next = node;
            node.next = head;
            tail=node;
        }else{
            Singly_LL_Circular temp = head;
            for(int i = 0 ; i < location -1 ; i++){
                temp=temp.next;
            }
            node.next = temp.next;
            temp.next=node;
        }
        System.out.println("Value Inserted Successfully");
        size++;
    }
    public int deleteNode(int location){
        if(location<0){
            System.out.println("Invalid location");
            return -1;
        }
        if(head == null){
            System.out.println ("Link list does not exist");
            return -1;
        }
        Singly_LL_Circular temp = head;
        int extraTemp = 0;
        if(location==0) {
            head=head.next;
            tail=head;
        }else if (location >=size) {
            for (int i = 0; i<size-1;i++) {
                temp = temp.next;
            }
            extraTemp = temp.next.data;
            tail=temp;
            temp.next=head;
        }else {
            for (int i = 0; i < location-1; i++) {
                temp=temp.next;
            }
            extraTemp = temp.next.data;
            temp.next=temp.next.next;
        }
        size--;
        return extraTemp;
    }

    public void traverseLL() {
        Singly_LL_Circular temp = head;
        for(int i = 0; i<size; i++) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(head.data+" (Head) \n");
    }

    public boolean searchNode(int value){
        if(head!=null){
            Singly_LL_Circular temp = head;
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
}
