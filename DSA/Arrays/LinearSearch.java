package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        System.out.println("Enter array:");
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter number:");
        int no=scanner.nextInt();
        LinearSearch l=new LinearSearch();
        boolean res=l.findElement(arr,no);
        if(!res)
        System.out.println(no+"Not present in array");
    }

    public boolean findElement(int[] arr, int no) {
         
        for(int i=0;i<arr.length;i++) {
           if(arr[i]==no) {
            System.out.println(no+" found at "+i+" th index position");
            return true;
           }
           
         }

         return false;
    }
}
