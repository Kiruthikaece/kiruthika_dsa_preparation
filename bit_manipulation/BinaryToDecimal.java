public class BinaryToDecimal {
    public static void main(String[] args) {
        String n="111";
        int res=convertBinaryToDecimal(n);
        System.out.println(res);
    }

    private static int convertBinaryToDecimal(String s) {
        int sum=0;
        int n=s.length()-1;
        for(int i=n;i>=0;i--) {
            sum+=(s.charAt(i)-'0')*Math.pow(2,n-i);
            System.out.println(sum+"sum");
        }
        return sum;
    }
}
