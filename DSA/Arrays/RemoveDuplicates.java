package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        int res=removeDuplicate(arr);
        System.out.println("\n result:"+res);
        scanner.close();

    }

    private static int removeDuplicate(int[] arr) {
        
       int i=0;
       for(int j=1;j<arr.length;j++) 
        if(arr[j]!=arr[i]) {
            arr[i+1]=arr[j];
            i++;
        }
       System.out.println(Arrays.toString(arr));
        for(int k=0;k<i+1;k++)
        System.out.print(arr[k]+" ");

        return i+1;

        // ----  Brute-force  -----
        // Set<Integer> set=new HashSet<>();

        // for(int i=0;i<arr.length;i++)
        // set.add(arr[i]);

        // System.out.println("Enter arr");
        // for(Integer s:set)
        // System.out.print(s+" ");
        // return set.size();
    }
}
