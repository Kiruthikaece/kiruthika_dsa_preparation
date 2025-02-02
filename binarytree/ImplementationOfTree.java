

import java.util.*;

class TNode {
    TNode left;
    TNode right;
    int data;
    TNode(int data) {
        this.data=data;
    }
}
public class ImplementationOfTree {
     
   public TNode createTree() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter node value (-1 for null): ");
        int value = scanner.nextInt();

        if (value == -1) {
            return null; 
        }

        TNode node = new TNode(value);

        System.out.println("Does " + value + " have a left child? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter left child of " + value);
            node.left = createTree();
        }

        System.out.println("Does " + value + " have a right child? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("Enter right child of " + value);
            node.right = createTree();
        }

        return node;
    }
    public static void main(String[] args) {

        ImplementationOfTree t=new ImplementationOfTree();
        TNode root=t.createTree();
        t.preorder(root);

    }
    private void preorder(TNode root) {
         if(root!=null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
         }
    }
    
}
