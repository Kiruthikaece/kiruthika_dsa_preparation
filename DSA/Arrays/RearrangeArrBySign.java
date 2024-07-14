package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RearrangeArrBySign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
       // RearrangeArray(arr);
         RearrangeArray1(arr);
    }

    public static void RearrangeArray(int[] arr) {
        int n=arr.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p=0,e=0,k=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0)
            pos[p++]=arr[i];
            else
            neg[e++]=arr[i];
        }

        for(int i=0;i<n/2;i++) {
            arr[k++]=pos[i];
            arr[k++]=neg[i];
        }

        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
  }


  //optimal
  public static void RearrangeArray1(int[] arr) {

    int n=arr.length;
    List<Integer> ans=new ArrayList<>(Collections.nCopies(n, 0));
    int positive=0,negative=1;

    for(int i=0;i<arr.length;i++)
    if(arr[i]>0) {
        ans.set(positive,arr[i]);
        positive=positive+2;
    } else{  
        ans.set(negative,arr[i]);
        negative=negative+2;
    }


    System.out.println(ans);
  }
}
