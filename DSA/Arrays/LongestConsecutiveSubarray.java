package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSubarray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        System.out.println("Enter array:");
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        // brute-force
        int res1=longestConsecutiveSubarr1(arr);
        System.out.println("ans:"+res1);

        //optimal
        int res2=longestConsecutiveSubarr2(arr);
        System.out.println("ans:"+res2);
    }

    public static int longestConsecutiveSubarr1(int[] arr) {
         int count=1,lastSum=Integer.MIN_VALUE,maxCount=1;
         Arrays.sort(arr); 

         for(int i=0;i<arr.length;i++) {
            if(arr[i]-1==lastSum) 
            count++;
            else
            count=1;
            maxCount=Math.max(maxCount,count);
            lastSum=arr[i];
            
         }
         return maxCount;
    }


    public static int longestConsecutiveSubarr2(int[] arr) {
         Set<Integer> set=new HashSet<>();
            int count=1,maxCount=1;
         for(int i=0;i<arr.length;i++)
         set.add(arr[i]);

         for(Integer in:set) {
            if(!set.contains(in-1)) {
                count=1;
                int x=in;

                while(set.contains(x+1)) {
                    count++;
                    x=x+1;
                }

                maxCount=Math.max(maxCount,count);  
            }
           
         }
         return maxCount;
    }
}
