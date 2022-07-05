package uts_205314020;
public class UTS_205314020 {
    public static void main(String[] args) {
        Tree phn = new Tree();
        phn.insert(16);
        phn.insert(82);
        phn.insert(15);
        phn.insert(25);
        phn.insert(83);
        phn.insert(63);
        phn.insert(26);
        phn.insert(25);
//        9	205314020	16,82,15,25,83,63,26,25
        System.out.println("");
        System.out.println("Pre-Order");
        phn.preorderTraversal();
        System.out.println("");
        System.out.println("");
        
        System.out.println("In-Order");
        phn.inOrderTraversal();
        System.out.println("");
        System.out.println("");
        
        System.out.println("Post-Order");
        phn.postOrderTraversal();
        System.out.println("");
        System.out.println("");
        
        System.out.println("NIM Genap 205314020");
        System.out.println("Jumlah Node Leaf: " + phn.getCountLeaf());
        System.out.println("");
        
        
        System.out.println("Node nya adalah : ");
        phn.leaf();
        System.out.println("");
    }
    
}
