package Arrays;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        printPascal(n);
    }
    public static void printPascal(int n) {
        int[][] arr=new int[n][];

        for(int i=0;i<n;i++) {
            arr[i]=new int[i+1];
            for(int j=0;j<=i;j++)
             if(j==0 || i==j)
             arr[i][j]=1;
             else
             arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++)
            System.err.print(arr[i][j]+" ");
            System.out.println();
        }
        
    }
}
