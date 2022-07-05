
package uts_205314020;

public class TreeNode {
    private int Data;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parent;

    public TreeNode(int data){
        this.Data = data;
    }

    public int getData(){
        return this.Data;
    }
      
    public void setData(int data){
        this.Data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode(){
        return rightNode;
    }

    public void setLeftNode(TreeNode node){
        this.leftNode = node;
    }

    public void setRightNode(TreeNode node){
        this.rightNode = node;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    
}
