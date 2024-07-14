package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class PrintSingleNo {
   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        System.out.println("Enter array:");
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        int res=findSingleElement(arr);
        System.out.println("output:"+res);
        
   }

private static int findSingleElement(int[] arr) {
    int[] hash=new int[arr.length+1];

    for(int i=0;i<arr.length;i++) {
        hash[arr[i]]++;
    }

    for(int i=0;i<hash.length;i++)
    if(hash[arr[i]]==1)
    return  arr[i];

    return -1;

}

public static int findSingleElement2(int[] arr) {
    int xor=0;
    for(int i=0;i<arr.length;i++)
    xor=xor^arr[i];

    return xor;
}


// brute - force
 /* public static int findSingleNo1(int[] arr) {
    int singleNo=0;
    for(int i=0;i<arr.length;i++) {
        int count=0;
        for(int j=0;j<arr.length;j++)
        if(arr[i]==arr[j]) {
            count++;
        }
        

        if(count==1) {
            singleNo=arr[i];
            break;
        }
       
    }
    return singleNo;
} */
 

// brute-force

 /* public static int findSingleNO2(int[] arr) {
     Arrays.sort(arr);
     int singleNo=0;
     if(arr[0]!=arr[1])
     singleNo=arr[0];
     else if(arr[arr.length-1]!=arr[arr.length-2])
     singleNo=arr[arr.length-1];
     else {
        for(int i=1;i<arr.length-1;i++) {
        if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1])
        singleNo=arr[i];
         }
     }

     
     return singleNo;
} */
}