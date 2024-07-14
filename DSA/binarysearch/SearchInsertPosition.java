package binarysearch;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter array length:");
	int n=sc.nextInt();
	int[] arr=new int[n];
    System.out.println("Enter array:");
	for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
	System.out.println("Enter target:");
	int target=sc.nextInt();
    int position=findPosition(arr,target);
    System.err.println("Target position:"+position);
}

    private static int findPosition(int[] arr, int target) {
         int left=0,right=arr.length;
         while(left<right) {
            int mid=(left+right)/2;
            if(arr[mid]==target)
            return target;
            if(arr[mid]>target)
            right=mid-1;
            else
            left=mid+1;
         }

         return left;
    }
}
