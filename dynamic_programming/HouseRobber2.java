
import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] arr={2,4,2};
        int n=arr.length;
        int[] temp1=new int[n-1];
        int[] temp2=new int[n-1];
        int k=0,l=0;
        for(int i=0;i<arr.length;i++) {
            if(i!=0)   // not take first element
            temp1[k++]=arr[i];
            if(i!=n-1)  // not take last element
            temp2[l++]=arr[i];
        }

         System.out.println(Math.max(findHouseRobber(temp1),findHouseRobber(temp1)));

    }

    private static int findHouseRobber(int[] arr) {
         int[] dp=new int[arr.length];
         Arrays.fill(dp,-1);
         dp[0]=arr[0];

         for(int i=1;i<arr.length;i++) {
            int pick=arr[i];
            if(i>1)
            pick+=dp[i-2];

            int nonpick=dp[i-1];

            dp[i]=Math.max(pick,nonpick);
         }
         return dp[arr.length-1];
    }
}
