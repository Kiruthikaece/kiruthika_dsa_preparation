package test;

public class Interface {

	public static void main(String[] args) {
		
		Animal obj=new TestingInterface();
//		(obj.x);
		System.out.println(Animal.x);
		//Animal.print();

	}

}


interface Animal {
   int x=10;
   
   private void print() {
    	System.out.println("xxx");
    }
    
  
    
}

 class TestingInterface implements Animal {
	 int x=20;
	 
	    
	//public abstract void print();
}
