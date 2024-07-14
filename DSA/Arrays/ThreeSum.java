package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        List<List<Integer>> res1=getThreeSum(arr);
        System.out.println(res1);


        List<List<Integer>> res2=getThreeSumOptimal(arr);
        System.out.println(res2);
    }


    private static List<List<Integer>> getThreeSumOptimal(int[] arr) {
            Arrays.sort(arr);
        List<List<Integer>> list=new ArrayList<>();

       for(int i=0;i<arr.length;i++) {
        if(i!=0 && arr[i]==arr[i-1])
        continue;

        int j=i+1;
        int k=arr.length-1;

        while(j<k) {
            int sum=arr[i]+arr[j]+arr[k];
            if(sum<0)
            j++;
            else if(sum>0)
            k--;
            else {
                List<Integer> li=Arrays.asList(arr[i],arr[j],arr[k]);
                list.add(li);
                j++;
                k--;
                if(j<arr.length && arr[j]==arr[j-1])
                j++;
                if(k>=0 && arr[k]==arr[k+1])
                k--;
            }
        }
       }

       return list;
    }


    // Brute- force (Time limit exceed)
    private static List<List<Integer>> getThreeSum(int[] arr) {

       
        Set <List<Integer>> set=new HashSet<>();

         for(int i=0;i<arr.length;i++) {
            
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1;k<arr.length;k++)
                if(arr[i]+arr[j]+arr[k]==0) {
                    List<Integer> li=Arrays.asList(arr[i],arr[j],arr[k]);
                    li.sort(null);
                    set.add(li);
                }
           
            }
           
         }

         List<List<Integer>> list=new ArrayList<>(set);
         return list;
    }
}
