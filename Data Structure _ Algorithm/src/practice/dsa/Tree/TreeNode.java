package practice.dsa.Tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;
    public TreeNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }
    public void addChild(TreeNode child) {
        children.add(child);
    }
    public String print(int level) {
        StringBuilder result;
        result = new StringBuilder("-----|".repeat(level) + data + "\n");
        for (TreeNode child : children) {
            result.append(child.print(level + 1));
        }
        return result.toString();
    }
}
