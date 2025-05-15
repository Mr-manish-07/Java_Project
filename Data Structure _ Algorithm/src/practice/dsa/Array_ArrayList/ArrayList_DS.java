package practice.dsa.Array_ArrayList;

import java.util.ArrayList;

public class ArrayList_DS {
    ArrayList<Integer> arrList = new ArrayList<>();
    ArrayList_DS(int size){
        for (int i = 0; i < size; i++) {
            arrList.add(Integer.MIN_VALUE);
        }
    }
    public void insertion(int data,int index){
        arrList.remove(index);
        arrList.add(index, data);
    }
    public void addLast(int data){
        arrList.add(data);
    }
    public void search(int data){
        int size = 0;
        for(Integer val : arrList){
            if(val == data){
                System.out.println("Element Found at index " + size);
                return;
            }
            size++;
        }
        System.out.println("Element Not Found");
    }
    public void accessElement(int index){
        System.out.println("Got element , element is "+arrList.get(index));
    }
    public void deleteElement(int index){
        System.out.println("Element removed Successfully : "+arrList.remove(index));
    }
    public void traverseArr(){
        for (int i = 0; i < arrList.size(); i++) {
            System.out.println (i+" Element is :"+arrList.get(i));
        }
    }

}
