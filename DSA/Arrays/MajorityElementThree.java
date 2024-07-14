package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementThree {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        // modify majority elemnt n/2 
        List<Integer> res1=majorityElement1(arr);
        System.out.println("majority element:"+res1);

        List<Integer> res2=majorityElement2(arr);
        System.out.println("majority element using map:"+res2);

        // if majority element always exist
        List<Integer> res3=majorityElement3(arr);
        System.out.println("majority element using \" Extended moore's voting algorithm:  \" "+res3);
    }

private static List<Integer> majorityElement3(int[] arr) {
        int co1=0,co2=0;
        int e1=Integer.MIN_VALUE,e2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
           if(co1==0 && e2!=arr[i])  {
            co1++;
            e1=arr[i];
           }
            else if(co2==0 && e1!=arr[i]) {
                co2++;
                e2=arr[i];
            }
            else if(arr[i]==e1)
            co1++;
            else if(arr[i]==e2)
            co2++;
            else {
                co1--;co2--;
            }
        }

        co1=co2=0;

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==e1)
            co1++;
            if(arr[i]==e2)
            co2++;
        }

        List<Integer> list=new ArrayList<>();

        list.add(e1);
        list.add(e2);


        return list;

}

private static List<Integer> majorityElement2(int[] arr) {
   
       Map<Integer,Integer> map=new HashMap<>();
       int n=arr.length;
       List<Integer> list=new ArrayList<>();

       for(int i=0;i<arr.length;i++) {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

       for(Map.Entry<Integer,Integer> mpp:map.entrySet()) {
       if(mpp.getValue()>n/3)
       list.add(mpp.getKey());
       }

       return list;
}

private static List<Integer> majorityElement1(int[] arr) {
    int element=0,count=0;
    int n=arr.length;
    List<Integer> list=new ArrayList<>();
    Arrays.sort(arr);
      for(int i=0;i<arr.length;i++) {
         if(count==0) {
            element=arr[i];
          
         }
         if(element==arr[i])
         count++;
         else {
           if(count>n/3 && !list.contains(element))
            list.add(element);

            element=arr[i];
            count=1;
         }
        System.out.println(element+"->"+count);
      }

    if(count>n/3 && !list.contains(element))
    list.add(element);

      return list;
}
 
}
