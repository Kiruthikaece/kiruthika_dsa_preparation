
public class LambdaExpression {

	public static void main(String[] args) {
		
		
		// with arguments and return and multiple lines
		Bank b= (amount, balance) ->  {
			System.out.println("Amount:"+amount+" "+"Balance:"+balance);
			return amount+balance;
		};
		System.out.println(b.credit(25000,1000));
		
		// implemets empty
	   //	Bank b= () ->  {};
	
		
		// using multithreading
		
		Runnable r=() -> {
			for(int i=1;i<=5;i++)
				System.out.println(Thread.currentThread().getName());
		};
		
		Thread t1=new Thread(r);
		t1.start();

	}

}


interface Bank {
	public int credit(int amount,int balance);
}