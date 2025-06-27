
class Vechicle {
	int wheels;
	protected void run() {
		  System.out.println("vechilcle is moving...");	
		}
}

class Bike extends Vechicle{
	protected void run() throws NullPointerException {
	  System.out.println("bike is moving...");	
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
	   Vechicle obj1=new Bike();
	   obj1.run();  //rule -1
	}

}


// 1. if you access create object "reference type is parent" and "child is a object type" you access only common method it means 
//  the method or variable must be present in parent class ow get "compiler -error"."

// 2. method overriding is possible only if they are inheritance
   // method overriding is impossible to static , private ,final methods and constructors.

//  Exception

// 1.subclass throw a same or subtype exception.

// 2. must be not throw a new border exception

// 3.subclass throw a new exception but superclass doesn;t have a exception must throw a exception for super class.

// 4. overridded method not necessary throw super class exception if not needed.

//  5. unchecked exception can throw any unchecked or no unchecked exception;
