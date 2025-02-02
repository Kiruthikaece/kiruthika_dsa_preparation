import java.util.Arrays;

public class FrogJump3 {
    public static void main(String[] args) {
        int[] arr={30,10,60,10,60,50};
        int[] res=new int[arr.length];
        Arrays.fill(res,-1);
        int res1=memorization(arr,arr.length-1,res);
        System.out.println(res1);

        int res2=tabulation(arr);
        System.out.println(res2);
    }

    private static int tabulation(int[] arr) {
       int[] dp=new int[arr.length];
       Arrays.fill(dp,-1);
       int secondJump=Integer.MAX_VALUE;
       dp[0]=0;
       for(int i=1;i<arr.length;i++) {
        int firstJump=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
        if(i>1)
        secondJump=dp[i-2]+Math.abs(arr[i]-arr[i-2]);

        dp[i]=Math.min(firstJump,secondJump);
       }

       return dp[arr.length-1];
    }

    private static int memorization(int[] arr,int ind,int[] res) {
        if(ind<=0)
        return 0;

        if(res[ind]!=-1)
        return res[ind];

        int secondJump=Integer.MAX_VALUE;
        int firstJump=memorization(arr,ind-1,res)+Math.abs((arr[ind]-arr[ind-1]));
        if(ind>1) 
        secondJump=memorization(arr, ind-2, res)+Math.abs((arr[ind]-arr[ind-2]));
        System.out.println("firstJump..."+firstJump+"..secondJump.."+secondJump+"..index.."+ind);


        return res[ind]=Math.min(firstJump,secondJump);
    }
}