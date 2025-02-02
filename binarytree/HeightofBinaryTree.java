class TNode2 {
    TNode2 left;
    TNode2 right;
    int data;

    TNode2(int data) {
        this.data=data;
    }
}

public class HeightofBinaryTree {
    public static void main(String[] args) {
        TNode2 root=new TNode2(1);
        root.left=new TNode2(2);
        root.right=new TNode2(3);
        root.right.left=new TNode2(4);
        root.right.right=new TNode2(5);
        root.right.left.left=new TNode2(6);

        int res=findHeight(root);
        System.out.println(res);
    }

    private static int findHeight(TNode2 root) {
        if(root==null)
        return 0;


        int left=findHeight(root.left);
        System.out.println(left+"left"+root.data+"data");
        int right=findHeight(root.right);
        System.out.println(right+"right"+root.data+"data");

        return 1+Math.max(left,right);
 
        }
}