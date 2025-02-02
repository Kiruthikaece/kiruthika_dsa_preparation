package binarytree;

class TNode3 {
    TNode3 left;
    TNode3 right;
    int data;

    TNode3(int data) {
        this.data=data;
    }
}



public class BalancedBinaryTree {
    public static void main(String[] args) {
        TNode3 root=new TNode3(1);
        root.left=new TNode3(2);
        root.right=new TNode3(2);
        root.left.left=new TNode3(3);
        root.left.left.left=new TNode3(4);
        root.right.right=new TNode3(3);
        root.right.right.right=new TNode3(4);
       // root.right.left.left=new TNode3(6);

        boolean res=isBalancedBinaryTree(root);
        System.out.println(res);
    }

    private static boolean isBalancedBinaryTree(TNode3 root) {
        

        return findBalancedBinaryTree(root)!=-1;
    }

    private static int findBalancedBinaryTree(TNode3 root) {
        if(root==null)
        return 0;

        int left=findBalancedBinaryTree(root.left);
        System.out.println(left+"..left.."+root.data);
        int right=findBalancedBinaryTree(root.right);
        System.out.println(right+"right.."+""+root.data);

       
            if(left==-1 || right==-1)
            return -1;
        
        if(Math.abs(left-right)>1) 
        return -1;
        return 1+Math.max(left,right);
    }
}