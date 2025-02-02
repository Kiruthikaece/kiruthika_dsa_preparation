import java.util.Scanner;


class LinkedListC {

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

    public void printLL() {
        Node temp=head;
 
        while(temp!=null) {
         System.out.print(temp.data+" ");
         temp=temp.next;
        }
     }

    public void deleteLL(int pos,int n) {
         if(pos==1) {
          if(head.next!=null)
           head=head.next;
         }  else if(pos<=n) {
            Node temp=head;
            Node pre=null;
            for(int i=0;i<pos-1;i++) {
                pre=temp;
                temp=temp.next;
            }

            pre.next=temp.next;

         }
         else
         System.out.println("Invalid pos");

    }

    public void deleteNo(int no) {
        if(head.data==no)
        head=head.next;
        else {
            Node pre=null;
            Node current=head;

            while(current!=null) {
                if(current.data==no)
                pre.next=current.next;

                pre=current;
                current=current.next;

            }
        }
    }
}

public class DeleteLL {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        LinkedListC l=new LinkedListC();
        
        System.err.println("Enter n:");
        int n=sc.nextInt();
        int i=0;

        System.err.println("Enter array:");
        while(i<n) {
            int element=sc.nextInt();
            l.insert(element);
            i++;
        }

        System.out.println("Enter delete position:");
        int pos=sc.nextInt();

        System.out.println("Before:");
        l.printLL();
        l.deleteNo(pos);
        //l.deleteLL(pos,n);
        System.out.println("\nAfter:");
        l.printLL();
        l.printLL();

    }
}
