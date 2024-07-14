package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        PrintAllLadders(arr);
    }

    public static void PrintAllLadders(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        int n=arr.length,ladder=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--) 
            if(arr[i]>ladder) {
                ladder=arr[i];
                ans.add(ladder);
            }

            Collections.sort(ans,Collections.reverseOrder());
        
           System.out.println(ans); 
        
    }
}
