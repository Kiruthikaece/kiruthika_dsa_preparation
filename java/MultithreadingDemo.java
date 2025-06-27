
public class MultithreadingDemo {

	public static void main(String[] args) throws InterruptedException  {
		
		//Thread.currentThread().setName("mainMethod111");
		
		
		Thread main=Thread.currentThread();
		//main.setPriority(2);
		System.out.println(main.getName()+"->"+main.getPriority());
		
		
		
		Thread t1=new MyFirstThread();
		t1.start();  // t1.setName("MYFIRST"); // set thread name
		//t1.setPriority(Thread.MIN_PRIORITY);
		
		
		Thread t2=new Thread(new MySecondThread());
		t2.start();
		
		
		//t2.setPriority(Thread.MAX_PRIORITY);
		
		// t1.start();   throw IllegalThreadStateException  restart the thread
		
		//t1.join();
		
		
	}

}


class MyFirstThread extends Thread {
	
	// default-thread name
	
	public void run() {
		
		for(int i=1;i<=5;i++)
		System.out.println(Thread.currentThread().getName()+"->"+Thread.currentThread().getPriority());
		Thread.currentThread().yield();
	}
}

class MySecondThread implements Runnable {

	
	@Override
	public void run() {
//		try {
//			Thread.sleep(5000);   // it is -5000 get IllegalArgumentException
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=1;i<=5;i++)
		System.out.println(Thread.currentThread().getName()+"->"+Thread.currentThread().getPriority());
		Thread.currentThread().yield();
	}
	
}


//  1. start()  - Initialize the thread.

//  2. run() - normal method call

// 3. 





//join example


//public class JoinExample1 extends Thread  
//{    
//    public void run()  
//    {    
//        for(int i=1; i<=4; i++)  
//        {    
//            try  
//            {    
//                Thread.sleep(500);    
//            }catch(Exception e){System.out.println(e);}    
//            System.out.println(i);    
//        }    
//    }    
//    public static void main(String args[])  
//    {   
//        // creating three threads  
//        JoinExample1 t1 = new JoinExample1();    
//        JoinExample1 t2 = new JoinExample1();    
//        JoinExample1 t3 = new JoinExample1();    
//        // thread t1 starts  
//        t1.start();   
//        // starts second thread when first thread t1 is died.  
//        try  
//        {    
//            t1.join();    
//        }catch(Exception e){System.out.println(e);}    
//        // start t2 and t3 thread   
//        t2.start();   
//        t3.start();    
//    }    
//}