
public class Multithreading {

	public static void main(String[] args) {
		Test test=new Test();
		test.start();
	}

}


class Test extends Thread {
	  public void run() {
		  System.out.println("thread1");
		}
}