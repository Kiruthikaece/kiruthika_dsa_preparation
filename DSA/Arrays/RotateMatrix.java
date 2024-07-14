package Arrays;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int m=sc.nextInt();
        System.out.println("Enter column:");
        int n=sc.nextInt();
        int[][] mat=new int[m][n];
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        mat[i][j]=sc.nextInt();
       // RotateMatrix1(mat);
        RotateMatrix2(mat);

    }

    //optimal
    public static void RotateMatrix2(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<mat.length/2;i++) {
            for(int j=i;j<n-i-1;j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[n-j-1][i];
                mat[n-j-1][i]=mat[n-i-1][n-j-1];
                mat[n-i-1][n-j-1]=mat[j][n-i-1];
                mat[j][n-i-1]=temp;
            }
        }

        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) 
                System.out.print(mat[i][j]+" ");
                System.out.println();
         }

    }

    public static void RotateMatrix1(int[][] mat) {
         
        // travarse mat

        for(int i=0;i<mat.length;i++) {
            for(int j=i;j<mat.length;j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
         }

         for(int i=0;i<mat.length;i++) {
                int left=0,right=mat.length-1;
                while(left<right) {
                    int temp=mat[i][left];
                    mat[i][left]=mat[i][right];
                    mat[i][right]=temp;
                    left++;
                    right--;
                }
         }

         for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat.length;j++) 
                System.out.print(mat[i][j]+" ");
                System.out.println();
         }



    }


    //  optimal


}
