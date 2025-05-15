package practice.dsa.stack;

public class Stack_MultiStack {
    int arr[] = new int[9];
    int stackSize = 3;
    int[] top = {-1, -1, -1};
    public void insertVal(int stackNo, int val) {
        if (top[stackNo] == stackSize-1) {
            System.out.println("Stack " + stackNo + " is full");
            return;
        }
        top[stackNo]++;
        int index = stackNo * stackSize + top[stackNo];
        arr[index] = val;
    }
    public int  pop(int stackNo) {
        if(top[stackNo] == -1) {
            System.out.println("Stack " + stackNo + " is empty");
            return -1;
        }
        int index = stackNo * stackSize + top[stackNo];
        int val = arr[index];
        arr[index] = Integer.MIN_VALUE;
        top[stackNo]--;
        return val;
    }
    public int peek(int stackNo) {
        if(top[stackNo] == -1) {
            System.out.println("Stack " + stackNo + " is empty");
        }
        int index = stackNo * stackSize + top[stackNo];
        return arr[index];
    }

}
