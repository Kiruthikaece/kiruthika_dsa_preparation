package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarrayWithSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter array:");
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter sum:");
        int k=scanner.nextInt();
        //brute - force
        int res1=CountSubarrayWithSum1(arr,k);
        System.out.println("Total count subarry sum:"+res1);

       // optimal
        int res2=CountSubarrayWithSum2(arr,k);
        System.out.println("Total count subarry sum:"+res2);
    }

     //brute - force
    public static int CountSubarrayWithSum1(int[] arr,int k) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            int sum=0;
        for(int j=i;j<arr.length;j++) {
            sum+=arr[j];
          
            if(sum==k)
            count++;
        }
        }


        return count;
    }

    //optimal

    public static int CountSubarrayWithSum2(int[] arr,int k) {
        int count=0,prefixSum=0,removeSum=0;

        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<arr.length;i++) {
            prefixSum+=arr[i];
            removeSum=prefixSum-k;
            if(map.containsKey(removeSum))
            count+=map.get(removeSum);

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }


        return count;

    }


}