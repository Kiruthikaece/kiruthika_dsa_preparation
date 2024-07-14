package Arrays;

import java.util.Scanner;

public class FindLargestElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        int result=FindLargestElementInArray(arr);
        System.out.println("Largest Element:"+result);
    }

    public static int FindLargestElementInArray(int[] arr) {
          int big=arr[0];
          for(int i=1;i<arr.length;i++)
          if(arr[i]>big)
          big=arr[i];

          return big;
    }
}