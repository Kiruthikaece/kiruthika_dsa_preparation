package Arrays;
import java.util.Scanner;

public class MoveZeroEnd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        moveZeroToEnd(arr);
        scanner.close();
    }

    public static void moveZeroToEnd(int[] arr) {

    int zeroIndex=0;
    for(int i=1;i<arr.length;i++) {
        if(arr[i]!=0) {
         int temp=arr[zeroIndex];
         arr[zeroIndex]=arr[i];
         arr[i]=temp;
         zeroIndex++;
        }
    }
        
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+" ");
       
        // ------------   Brute-force alg   ---------------------

        // int k=0;
        //  for(int i=0;i<arr.length;i++) {
        //     if(arr[i]!=0)
        //     arr[k++]=arr[i];
        //  }
        //  while(k<arr.length)
        //  arr[k++]=0;

        //  for(int i=0;i<arr.length;i++)
        //  System.out.print(arr[i]+" ");
    }
    
}
