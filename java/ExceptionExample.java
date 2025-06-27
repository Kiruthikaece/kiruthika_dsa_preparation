import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		UnCheckedException e=new UnCheckedException();
		e.ArithmeticExc();
	}

}

class UnCheckedException {
	
	public void ArithmeticExc () {
		
//	    try {
//	    	int x=10/0;
//	    	
//	    }
//	    catch(Exception e) {
//	    	e.printStackTrace();
//	    }
//	    
//
//	    try {
//	    	int[] arr=new int[5];
//	    	System.out.println(arr[10]);
//	    	
//	    }
//	    catch(Exception e) {
//	    	e.printStackTrace();
//	    }
	    
		Scanner sc=new Scanner(System.in);
	    int y=sc.nextInt();
	}
}
