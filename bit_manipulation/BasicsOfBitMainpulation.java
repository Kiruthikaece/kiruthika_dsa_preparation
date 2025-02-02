public class BasicsOfBitMainpulation {
    public static void main(String[] args) {
        int n=10,i=2;

        SetIthBit(n,i);

        clearIthBit(10,1);

        toggle(10,2);

        boolean res=PowerOfTwo(1024);
        System.out.println(res);

        removeLastBits(10);

        int res1=countSetBits(16);
        System.out.println(res1);
    }

    private static void removeLastBits(int n) {
       System.out.println(Integer.toBinaryString(n&n-1));
    }

    private static void clearIthBit(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        System.out.println("clear Ith bit:"+Integer.toBinaryString(n&(~(1<<i))));
    }

    private static void SetIthBit(int n, int i) {
         System.out.println(Integer.toBinaryString(n));
         System.out.println("set Ith bit:"+Integer.toBinaryString((1<<i) | n));
    }

    private static void toggle(int n, int i) {
        System.out.println(Integer.toBinaryString(n));
        System.out.println("toggle Ith bit:"+Integer.toBinaryString((1<<i)^n));
    }

    private static boolean PowerOfTwo(int n) {
       return (n&n-1)==0;
    }

    private static int countSetBits(int n) {
       int count=0;

       while(n!=0) {
            if((n&1)==1)
            count++;
            n= n>>1;
       }
       return count;
   }
}
