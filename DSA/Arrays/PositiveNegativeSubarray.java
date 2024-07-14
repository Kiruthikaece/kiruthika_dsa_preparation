package Arrays;

import java.util.Scanner;

public class PositiveNegativeSubarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter Sum:");
        int k=scanner.nextInt();
        int res=findSubarray(arr,k);
        System.out.println("res"+res);
    }

    private static int findSubarray(int[] arr, int k) {
        int maxLen=0;
       for(int i=0;i<arr.length;i++) {
        int sum=0;
        for(int j=i;j<arr.length;j++)  {
            sum+=arr[j];
            if(sum==k)
            maxLen=Math.max(maxLen,j-i+1);
        } 
       }return maxLen;

    }

}