package Arrays;

import java.util.Scanner;

public class StockBuyandSell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] prices=new int[n];
        System.out.println("Enter prices:");
        for(int i=0;i<n;i++)
        prices[i]=sc.nextInt();
        int res=findStocks2(prices);
        System.out.println("Maximum profit:"+res);
        // int res1=findStocks(prices);
        // System.out.println("Maximum profit:"+res1);
    }


    public static int findStocks2(int[] arr) {
        int buy=Integer.MAX_VALUE,sell=0;

        for(int i=0;i<arr.length;i++) {
            buy=Math.min(buy,arr[i]);
            sell=Math.max(sell,arr[i]-buy);
        }

        return sell;
    }
   /*    Brute-force
   private static int findStocks(int[] prices) {
        int maxProfit=0;
         for(int i=0;i<prices.length;i++) {
            for(int j=i+1;j<prices.length;j++) {
                if(prices[j]>prices[i])
                maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
            }
         }

         return maxProfit;
    }
   */ 



}