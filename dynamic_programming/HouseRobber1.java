import java.util.Arrays;

public class HouseRobber1 {
    public static void main(String[] args) {
        int[] arr={1,2,4};

        // tabulation
        int[] dp=new int[arr.length];
        dp[0]=arr[0];
        int n=arr.length;
        for(int i=1;i<arr.length;i++) { 
          int pick=arr[i];
          if(i>1)
          pick+=dp[i-2];

          int nonpick=dp[i-1];
           
          dp[i]=Math.max(pick,nonpick);
        }

         System.out.println(dp[n-1]);
        
         // memorization
         int[] res=new int[arr.length];
         Arrays.fill(res,-1);
         int res1=memorization(arr,arr.length-1,res);
         System.out.println(res1);
    }

    private static int memorization(int[] arr,int index,int[] res) {
        if(index<0)
        return 0;

        if (index == 0) 
        return arr[index];

        if(res[index]!=-1)
        return res[index];

        int first=arr[index]+memorization(arr,index-2,res);

        int second=memorization(arr,index-1,res);

        return res[index]=Math.max(first,second);



    }
}
