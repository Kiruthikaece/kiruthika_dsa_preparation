
public class Wrapper {

	public static void main(String[] args) {
		int i=10;
		Integer j=i;
		System.out.println(j);
		
		Float f1=10.2f;
		double f2=f1;
		System.out.println(f2);
		
		String obj1="92";
		int a1=Integer.parseInt(obj1);
		Integer a2=Integer.valueOf(obj1);
		System.out.println(a1+"..."+a2);
		
		
		// primitive - string
		
		
		String s1=Integer.toString(a1);
		System.out.println("primitive - string"+s1);
		
		
		// string - wrapper
		String s="1234";
		
		Integer i1= Integer.valueOf(s);
		System.out.println("string - wrapper"+i1);
		
		// string - primitive
		
		int one=Integer.parseInt(s);
		System.out.println(one);
	}

}
