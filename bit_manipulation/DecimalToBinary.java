
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int decimal=sc.nextInt();
        String res1=ConversionWithStorage1(decimal);
        System.out.println("Using string builder:"+res1);

        String res2=ConversionWithStorage2(decimal);
        System.out.println("Using string:"+res2);
        System.out.println();
       ConversionWithOutStorage(decimal);
       

    }

    private static String ConversionWithStorage1(int n) {
        StringBuilder sb=new StringBuilder();
          while(n!=0) {
            int d=n%2;
            if(d==0)
            sb.append(0);
            else
            sb.append(1);
            n=n/2;
          }

          return sb.reverse().toString();
    }

    private static String ConversionWithStorage2(int n) {
        String s="";
        while(n!=0) {
          int d=n%2;
          if(d==0)
          s="0"+s;
          else
          s="1"+s;
          n=n/2;
        }
        return s;
    }

    private static void ConversionWithOutStorage(int n) {
         int heighestPower=1;
         
         while(heighestPower<=n/2) {
          heighestPower*=2;
         }

          while(n>0) {
            if(n>=heighestPower) {
              System.out.print("1");
              n=n-heighestPower;
            } 
            else 
              System.out.print("0");
              heighestPower=heighestPower/2;
          }
    }


}