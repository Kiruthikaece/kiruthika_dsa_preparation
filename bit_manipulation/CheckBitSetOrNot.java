public class CheckBitSetOrNot {
    public static void main(String[] args) {
        int n=13,i=2;
        boolean res1=Checkset1(n,i);
        System.out.println(res1);

        boolean res2=Checkset2(n,i);
        System.out.println(res2);

        boolean res3=Checkset3(n,i);
        System.out.println(res3);
    }

    private static boolean Checkset1(int n, int i) {
         String s="";
         while(n!=0) {
            int d=n%2;
            if(d==0)
            s=s+"0";
            else
            s=s+"1";

            n=n/2;
         }

         if(i>=s.length())
         return false;

         System.out.println(s);

         return s.charAt(i)=='1';
    }

    //using right -shift
    private static boolean Checkset2(int n, int i) {
         return ((n>>i)&1)!=0;
    }

    //using left-shift
    private static boolean Checkset3(int n, int i) {
        return ((1<<i)&n)!=0;
    }
}
