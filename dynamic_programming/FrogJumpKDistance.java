
import java.util.Arrays;

public class FrogJumpKDistance {
    public static void main(String[] args) {
        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        int k = 2;
        int res1=tabulation(height,n,k);
        System.out.println(res1);

        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int res2=memorization(height,n,k,n-1,dp);
        System.out.println(res1);
    }

    private static int memorization(int[] height, int n, int k,int ind,int[] dp) {
           if(ind<=0)
           return 0;

           int second=Integer.MAX_VALUE;

           for(int i=1;i<=k;i++) {
              if(ind-i>=0) {
                int first=memorization(height,n,k,ind-i,dp)+Math.abs(height[ind]-height[ind-i]);
                second=Math.min(second,first);
              }
              dp[i]=second;
           }
           return dp[ind]=second;
    }

    private static int tabulation(int[] height, int n, int k) {
        int[] dp=new int[n];
        int first=0;
        dp[0]=0;
        for(int i=1;i<n;i++) {
           int second=Integer.MAX_VALUE;
            for(int j=1;j<=k;j++) {
                if(i-j>=0) {
                    first=dp[i-j]+Math.abs(height[i]-height[i-j]);
                    second=Math.min(second,first);
                }
            }
            dp[i]=second;
        }

        return dp[n-1];
    }
}
