import java.util.*;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data=data;
    }
}

class LinkedListCC {

    Node head,tail;
    
    
    public void insert(int element) {
      Node n=new Node(element);

      if(head==null) {
        head=n;
        tail=n;
      }

      tail.next=n;
      tail=n;
    }

    // public void insertHead(int ele) {
    //      Node temp2=head;
    //      head=new Node(ele);
    //      head.next=temp2;
    // }

    
    // void insertTail(int ele) {
    //     Node temp=new Node(ele);
    //     Node temp2=head;

    //     while(temp2.next!=null) {
    //         temp2=temp2.next;
    //     }
        
    //     temp2.next=temp;
    // }

    void printLL() {
        Node temp=head;
 
        while(temp!=null) {
         System.out.print(temp.data+" ");
         temp=temp.next;
        }
     }

    

    void insertElement(int pos, int ele) {
        if(pos==1) {
            Node temp=head;
            head=new Node(ele);
            head.next=temp;
        } else {
            Node t=head; 
            for(int i=0;i<pos-2;i++) 
            t=t.next;
            Node addressNextNode=t.next;
            Node t1=new Node(ele);
            t.next=t1;
            t1.next=addressNextNode;
        }
    }
 


}

public class InsertHeadLL {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        LinkedListCC l=new LinkedListCC();
        System.err.println("Enter n:");
        int n=sc.nextInt();
        int i=0;
        while(i<n) {
            int element=sc.nextInt();
            l.insert(element);
            i++;
        }

        System.out.println("Enter Position:");
        int pos=sc.nextInt();
        System.out.println("Enter elemnt in head:");
        int ele=sc.nextInt();

        System.err.println("\nBefore add element:");
        l.printLL();

        l.insertElement(pos,ele);

        System.err.println("\nAfter add HEAD:");
        l.printLL();
        
        

    }
}