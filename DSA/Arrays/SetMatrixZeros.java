package Arrays;

import java.util.Scanner;

public class SetMatrixZeros {
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
       // SetZeros(mat);
       setZeros1(mat);
        }


        //optimal
public static void setZeros1(int[][] mat) {
    int m=mat.length;
    int n=mat[0].length;
    boolean[] row=new boolean[m];
    boolean[] col=new boolean[n];

    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) 
            if(mat[i][j]==0) {
            row[i]=true;
            col[j]=true;
        }
    }


    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) {
            if(row[i] || col[j])
           mat[i][j]=0;
        }
    }

    for(int i=0;i<m;i++) {
        for(int j=0;j<n;j++) 
        System.out.print(mat[i][j]+" ");
        System.out.println();
    }
}

        /*   Brute-force
 
    public static void SetZeros(int[][] mat) {
         int row=mat.length;

        for(int i=0;i<row;i++) {
        for(int j=0;j<mat[i].length;j++) 
        if(mat[i][j]==0)
        setZeroRowCol(mat,i,j);        
        }


        for(int i=0;i<row;i++) {
            for(int j=0;j<mat[i].length;j++)
            if(mat[i][j]==-1)
            mat[i][j]=0;
        }
        for(int i=0;i<row;i++) {
            for(int j=0;j<mat[i].length;j++)
            System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        

    }

    public static void setZeroRowCol(int[][] mat, int row, int col) {
          for(int i=0;i<mat.length;i++)  {
            for(int j=0;j<mat[i].length;j++) {
                if(i==row || j==col)
                mat[i][j]=-1;
            }
            

          } 
    }
          */
}
