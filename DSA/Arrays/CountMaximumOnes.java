package Arrays;

import java.util.Scanner;

public class CountMaximumOnes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        int res=CountMaxConsectiveNo(arr);
        System.out.println("maximum one's consecutive number:"+res);
    }

    private static int CountMaxConsectiveNo(int[] arr) {
        int maxCount=0,count=0;
         for(int i=0;i<arr.length;i++) {
           if(arr[i]==1)
           count++;
           else {
            maxCount=Math.max(maxCount,count);
            count=0;
           }
         }

         if(maxCount<count)
         maxCount=count;
         return maxCount;
    }
}
