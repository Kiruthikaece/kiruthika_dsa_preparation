package Arrays;

import java.util.Scanner;

public class SecondLargsestElemet {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        int res=secondLargestElementInArr(arr);
        System.out.println("Second Largest Element:"+res);
        scanner.close();
    }

    public static int secondLargestElementInArr(int[] arr) {
        int first=arr[0],second=0;
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>first) {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first )  
            second=arr[i];
        }

        return second;
    }
}
