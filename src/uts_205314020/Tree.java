package uts_205314020;

public class Tree {

    TreeNode root;
    String dataPrint = "";
    TreeNode parent;
    int count = 0;

    public Tree() {
    }

    public Tree(TreeNode node) {
        this.root = node;
    }

    public void insert(int dataNode) {
        TreeNode newNode = new TreeNode(dataNode);
        if (root == null) {
            root = new TreeNode(dataNode);
            System.out.println("Data root = " + root.getData());
        } else {
            TreeNode ptr = root;
            while (true) {
                if (newNode.getData() <= ptr.getData()) {
                    if (ptr.getLeftNode() == null) {
                        ptr.setLeftNode(newNode);
                        newNode.setParent(ptr);
                        System.out.println("Data leftNode = " + ptr.getLeftNode().getData());
                        return;
                    } else {
                        ptr = ptr.getLeftNode();
                    }
                } else {
                    if (ptr.getRightNode() == null) {
                        ptr.setRightNode(newNode);
                        newNode.setParent(ptr);
                        System.out.println("Data rightNode = " + ptr.getRightNode().getData());
                        return;
                    } else {
                        ptr = ptr.getRightNode();
                    }
                }
            }
        }
    }

    public void preorderTraversal() {
        preOrderHelper(this.getRoot());
    }

    public void preOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + ", ");
            preOrderHelper(localRoot.getLeftNode());
            preOrderHelper(localRoot.getRightNode());
        }
    }

    public void inOrderTraversal() {
        inorderHelper(this.getRoot());
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + ", ");
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void postOrderTraversal() {
        postOrderHelper(this.getRoot());
    }

    public void postOrderHelper(TreeNode localRoot) {
        String dataReturn = "";
        if (localRoot != null) {
            postOrderHelper(localRoot.getLeftNode());
            postOrderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + ", ");
        }
    }

    public String getDataPrint() {
        return dataPrint;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void leaf() {
        getLeaf(this.getRoot());
    }

    private int getLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.print(node.getData() + " ");
            return 1;
        } else {
            return getLeaf(node.getLeftNode()) + getLeaf(node.getRightNode());
        }
    }
    
    public int getCountLeaf(){
        return getCount(this.root);
    }

    public int getCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            return 1;
        } else {
            return getCount(node.getLeftNode()) + getCount(node.getRightNode());
        }
    }
}
