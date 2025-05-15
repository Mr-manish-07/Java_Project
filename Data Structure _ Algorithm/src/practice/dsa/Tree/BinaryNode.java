package practice.dsa.Tree;
import java.util.*;
public class BinaryNode {
    public String data;
    public BinaryNode left;
    public BinaryNode right;
    public int height;
}
class BinaryTreeLL{
    public BinaryNode root;
    public BinaryTreeLL(){
        root = null;
    }
    public void preOrder(BinaryNode node){
        if(node.data == null) return;
        System.out.println(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(BinaryNode node){
        if(node.data == null) return;
        inOrder(node.left);
        System.out.println(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(BinaryNode node){
        if(node.data == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data+" ");
    }
}


