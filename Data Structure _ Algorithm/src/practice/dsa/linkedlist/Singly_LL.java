package practice.dsa.linkedlist;

public class Singly_LL {
	public int value,size;
    public Singly_LL head,next,tail;
	Singly_LL createSLL(int value){
		Singly_LL node = new Singly_LL();
		node.next=null;
		node.value = value;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	public void insertEle(int nodeValue,int location){
		Singly_LL node = new Singly_LL();
		node.value = nodeValue;
		if(head==null){
			createSLL (nodeValue);
			return;
		} else if (location >=size) {
			node.next =null;
			tail.next = node;
			tail=node;
		} else if (location==0) {
			node.next=head;
			head=node;
		} else {
			Singly_LL temp = head;
			int index =0;
			while (index < location-1){
				temp = temp.next;
				index++;
			}
			Singly_LL nextNode = temp.next;
			temp.next = node;
			node.next = nextNode;
		}
		size++;
	}
	public void traverse(){
		if(head==null){
			System.out.println ("Linked List Doesn't exit use ll.createSLL('Provide value here') to create LL");
		}else {
			Singly_LL tempNode = new Singly_LL();
			tempNode=head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				if(i!=size-1){
					System.out.print("->");
				}
				tempNode=tempNode.next;
			}
			System.out.println ("\n");
		}
	}
	
	public boolean searchNode(int value){
		if(head!=null){
			Singly_LL temp =head;
			for (int i = 0; i < size; i++) {
				if(temp.value==value){
					System.out.println ("Value found at index "+ i);
					return  true;
				}
				temp = temp.next;
			}
		}
		System.out.println ("Element Not found");
		return false;
	}
	
	public int deleteNode(int location){
		Singly_LL temp = head;
		int extraTemp = 0;
		if(head == null){
			System.out.println ("Link list does not exist");
			return -1;
		}else if(location==0) {
			extraTemp = head.value;
			head=head.next;
		}else if (location >=size) {
			for (int i = 0; i<size-1;i++) {
				temp = temp.next;
			}
			extraTemp = temp.next.value;
			tail=temp;
			temp.next=null;
		}else {
			for (int i = 0; i < location-1; i++) {
				temp=temp.next;
			}
			extraTemp = temp.next.value;
			temp.next=temp.next.next;
		}
		size--;
		return extraTemp;
		
	}
	public  void completeDelete(){
		head=tail=null;
	}
	
	
}

