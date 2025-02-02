class ANode {
    int data;
    ANode next;

    ANode(int data) {
        this.data=data;
    }

}


public class AddLinkedListToNumber {
    public static void main(String[] args) {
        ANode head=new ANode(4);
        head.next=new ANode(5);
        head.next.next=new ANode(9);
        printLL(head);
        System.out.println();
        AddNumberToOne(head);
        printLL(head);
    }

    private static void AddNumberToOne(ANode head) {
        ANode temp=head;
        int val=0;

        while(temp.next!=null) {
            val=temp.data;
            temp=temp.next;
        }
        val=temp.data;

        val=val+1;

        if(val<10)
        temp.data=val;
        else {
            temp.data=val/10;
            temp.next=new ANode(val%10);
        }
       
    }

    public static void printLL(ANode head) {
        ANode temp=head;

        while(temp!=null ) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
}
