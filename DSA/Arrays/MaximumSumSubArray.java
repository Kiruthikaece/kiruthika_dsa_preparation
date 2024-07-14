package Arrays;

import java.util.Scanner;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  n:");
        int n=sc.nextInt();
        System.out.println("enter  array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int res1=findMaxSum(arr);
        System.out.println(res1);
        // int res=findMaxSum(arr,0,0,0,0);
        // System.out.println(res);
        //findMaxSum(arr);
    }


    //optimal - kadane 's alg

    public static int findMaxSum(int[] arr) {
        
        int sum=0,maxlen=Integer.MIN_VALUE,start=-1,end=-1;
        for(int i=0;i<arr.length;i++) {

            if(sum==0)
            start=i;
             sum+=arr[i];
             if(sum>maxlen) {
                maxlen=sum;
                end=i;
             }
              
             if(sum<0) 
                sum=0;
            
        }

        System.out.println("subarray :");
        for(int i=start;i<=end;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
        return maxlen;
    }

  /*   Using recursion
  public static int findMaxSum(int[] arr, int i, int j, int maxlen, int sum) {
        if(i==arr.length)
        return maxlen;
        if(j==arr.length) {
            i=i+1;
            j=i;
            sum=0;
        }
        else {
            sum+=arr[j];
            j++;
        }
        
        if(sum>maxlen)
        maxlen=sum;

        return findMaxSum(arr,i,j,maxlen,sum);
    }  */ 

/*          Brute- force
 public static void findMaxSum(int[] arr) {
        int maxlen=0;
           for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                 sum+=arr[j];
                 if(sum>maxlen)
                 maxlen=sum;
            }
           }

           System.out.println("maximum length:"+maxlen);
    }
*/
    
    
}
