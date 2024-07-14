package Arrays;

// but only use in n*n matrix

import java.util.Scanner;

public class SpiralManner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrix row:");
        int n=sc.nextInt();
        System.out.println("Enter matrix col:");
        int m=sc.nextInt();
        System.out.println("Enter matrix:");
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
        mat[i][j]=sc.nextInt();
      //  findSpiral(mat);
        findSpiral2(mat);
    }

    public static void findSpiral(int[][] mat) { 

        int row=0,col=0;
        for(int i=0;i<mat.length;i++) {
            row=i;
            col=i;
            for(;col<mat.length-i;col++)
            System.out.print(mat[row][col]+" ");
            row=i+1;
            col=col-1;
            for(;row<mat.length-i;row++)
            System.out.print(mat[row][col]+" ");
            col=col-1;
            row=row-1;
            for(;col>=i;col--)
            System.out.print(mat[row][col]+" ");
            col++;
            row--;
            for(;row>i;row--)
            System.out.print(mat[row][col]+" ");
        }

        
    }

    public static void findSpiral2(int[][] mat) {
          int row=mat.length;
          int col=mat[0].length;
          int top=0,bottom=row-1,left=0,right=col-1;

          while(left<=right && top<=bottom){

            for(int i=left;i<=right;i++)
            System.out.print(mat[top][i] +" ");
            top++;

            for(int i=top;i<=bottom;i++)
            System.out.print(mat[i][right]+" ");
            right--;


            if(top<=bottom) {
                for(int i=right;i>=left;i--)
               System.out.print(mat[bottom][i]+" ");

                bottom--;
            }

            if(left<=right) {
                for(int i=bottom;i>=top;i--)
                System.out.print(mat[i][left]+" ");

                 left++;
            }
          }

    }


}
