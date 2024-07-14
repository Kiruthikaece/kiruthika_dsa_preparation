package Arrays;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array length:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int res1=majorityElement1(arr);
        System.out.println("majority element:"+res1);

        int res2=majorityElement2(arr);
        System.out.println("majority element using hasing:"+res2);

        // if majority element always exist
        int res3=majorityElement3(arr);
        System.out.println("majority element using moore's voting algorithm:"+res3);
    }



    //soln-1  Brute-force
    public static int majorityElement1(int[] arr) {

     for(int i=0;i<arr.length;i++) {
        int count=1;
        for(int j=i+1;j<arr.length;j++)
        if(arr[i]==arr[j])
        count++;
        if(count>=arr.length/2)
        return arr[i];
     }

     return -1;
    }

    //soln-2  better

    public static int majorityElement2(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        if(arr[i]>max)
        max=arr[i];

        int[] hash=new int[max+1];
        for(int i=0;i<arr.length;i++)
        hash[arr[i]]++;

        // for(int x:hash)
        // System.out.print(x+" ");
        
        int maxelement=0,maxIndex=-1;
        for(int i=0;i<hash.length;i++) {
            
            if(maxelement<hash[i] && hash[i]>=arr.length/2) {
                maxelement=hash[i];
                maxIndex=i;
            }
           
        }

       

        return maxIndex;
    }

    // moore's voting alogorithm - Optimal soln

    public static int majorityElement3(int[] arr) {
         int count=0,element=-1;
         for(int i=0;i<arr.length;i++) {
            if(count==0)
            element=arr[i];
            else if(arr[i]==element)
            count++;
            else
            count--;
         }

         return element;
    }
}
