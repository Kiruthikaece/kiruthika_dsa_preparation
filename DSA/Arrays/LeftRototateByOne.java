package Arrays;

import java.util.Scanner;

public class LeftRototateByOne {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter rotation:");
        int n=scanner.nextInt();
        LeftRotate(arr,n);
    }

    public static void LeftRotate(int[] arr,int n) {
          int rotate=0;
          while(rotate<n) {
              int element=arr[0];
              for(int i=0;i<arr.length-1;i++) 
                arr[i]=arr[i+1];
                arr[arr.length-1]=element;
                rotate++;
          }

          for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
       
}
