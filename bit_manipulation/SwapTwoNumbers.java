public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=5,b=6;
        swap1(a,b);
        swap2(a,b);
        swap3(a,b);
    }

    private static void swap1(int a, int b) {
         int temp=a;
         a=b;
         b=temp;
         System.out.println("a ="+a+"b ="+b);
    }

    private static void swap2(int a, int b) {
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("a ="+a+"b ="+b);
    }

    private static void swap3(int a, int b) {
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a ="+a+"b ="+b);
    }

   
}
