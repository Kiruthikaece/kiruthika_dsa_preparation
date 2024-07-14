package Arrays;

import java.util.Scanner;

public class IsSortedArr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");
        int len=scanner.nextInt();
        System.out.println("Enter array:");
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        if(ascendingOrder(arr) || descendingOrder(arr))
        System.out.println("true");
        else
        System.out.println("false");
    }

    private static boolean descendingOrder(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]<arr[i])
            return false;
        }
        return true;
    }

    private static boolean ascendingOrder(int[] arr) {
        for(int i=1;i<arr.length;i++) {
            if(arr[i-1]>arr[i])
            return false;
        }
        return true;
    }
}
