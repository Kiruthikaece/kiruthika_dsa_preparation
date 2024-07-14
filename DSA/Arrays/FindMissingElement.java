package Arrays;

import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array length:");  //3
        int len=scanner.nextInt();
        System.out.println("Enter array:");      // 1 2 4
        int[] arr=new int[len];
        for(int i=0;i<len;i++)
        arr[i]=scanner.nextInt();
        System.out.println("Enter find no:");     //4
        int no=scanner.nextInt();
        int res=pickMissingNo(arr,no);              // ans:3
        System.out.println(res);
    }

    public static int pickMissingNo(int[] arr,int no) {
         
         int sum=no*(no+1)/2;                // optimal solution
         int s1=0;
         for(int i=0;i<arr.length;i++) {
            s1+=arr[i];
         }
         return sum-s1;
    }
}


// better

/* 
int[] hash=new int[no+1];
        
for(int i=0;i<no-1;i++) {
 hash[arr[i]]++;
}

for(int i=1;i<=no;i++)
if(hash[i]==0)
return i;

return -1;
*/



// brute-force 

/*

int k=1;      
while(k<=no) {
    boolean ispre=false;
    for(int i=0;i<arr.length;i++) {
        if(arr[i]==k)
        ispre=true;
    }
    if(!ispre) 
      return k;  
    k++;
}
return -1;

*/