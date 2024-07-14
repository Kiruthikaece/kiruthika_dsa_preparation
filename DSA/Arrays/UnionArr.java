package Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionArr {
    public static void main(String[] args) {
     int[] arr1= {1,2,3,4,5,6,7,8,9,10};
     int[] arr2={2,3,4,4,5,11,12};
     List<Integer> union=findUnion(arr1,arr2);
     for(Integer num:union)
     System.out.print(num+" ");
    }

    private static List<Integer> findUnion(int[] arr1, int[] arr2) {
        
        List<Integer> union=new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j])
            {
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i])
                union.add(arr1[i]);
                i++;
            }
            else {
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j])
                union.add(arr2[j]);
                j++;
            }
        }

        while(i<arr1.length) {
           if(union.get(union.size()-1)!=arr1[i])
           union.add(arr1[i]);
           i++;
        }

        while(j<arr2.length) {
            if(union.get(union.size()-1)!=arr2[j])
            union.add(arr2[j]);
            j++;
         }
        return union;
    }




    //    brute-force  
    /*public static void findUnion(int[] arr1, int[] arr2) {
        int[] res=new int[arr1.length+arr2.length];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        res[k++]=arr1[i];
        for(int i=0;i<arr2.length;i++)
        res[k++]=arr2[i];
        sortArr(res);
        int first=0;
        for(int i=1;i<res.length;i++) 
         if(res[first]!=res[i])  {
         res[first+1]=res[i];
         first++;
         }
        
         for(int i=0;i<first+1;i++)
         System.out.print(res[i]+" ");
    }

    private static void sortArr(int[] res) {
       for(int i=0;i<res.length;i++) 
        for(int j=0;j<res.length-1;j++)
        if(res[j]>res[j+1]) {
            int temp=res[j];
            res[j]=res[j+1];
            res[j+1]=temp;
        }
       
    }*/

    
}
