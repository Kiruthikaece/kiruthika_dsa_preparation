package Arrays;

import java.util.Scanner;

public class PrintSumSubArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter Sum:");
        int k=scanner.nextInt();
        // brute-force
        int res1=printSumSubarr(arr,k);
        System.out.println("ans:"+res1);

        int res2=printSumSubarr1(arr,k);
        System.out.println("ans:"+res2);
    }

    public static int printSumSubarr(int[] arr, int k) {
      int sum=0,n=arr.length,length=0;

        for(int i=0;i<n;i++) {
            sum=0;
        for(int j=i;j<n;j++) {
            sum+=arr[j];
            if(sum==k) {
                length=Math.max(length,j-i+1);
            }
        }
    }

    return length;       
    }

    public static int printSumSubarr1(int[] arr, int k) {
        int left=0,right=0,
        sum=arr[0],maxLen=0;

        while(right<arr.length) {
            
            right++;

            //  sum right side element 

           if(right<arr.length)
            sum+=arr[right];
            
            // sum is greater than k left will subtract         
            while(left<=right && sum>k) {
                sum-=arr[left];
                left++;
            }

            //if sum==k greater than length
            if(sum==k)
            maxLen=Math.max(maxLen,right-left+1);

        }

        return maxLen;
    }
}
