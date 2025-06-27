
public class Inheritance {

	public static void main(String[] args) {
		
//		Engine engine=new Engine();
//		engine.drive();
		
		Car2 obj1=new Car2(10);
		obj1.run();
		
		Car2 obj2=new wheel(10);
		System.out.println(obj2.x+"xxx");
		obj2.run();
		
//		wheel obj3=(wheel)new Car2();
//		obj3.run();
		
	}

}

class Car2 {
	String model;
	int x;
	Car2(int val) {
		x=val;
	}
	void run() {
		System.out.println("running successfully.");
	}
}

class wheel extends Car2 {
	int x;
	wheel(int val) {
		super(val);
		x=val;
	}

	
	
	void run() {
		System.out.println("wheel running successfully.");
	}
}

// this and super  access the super class members.

class Engine extends Car2 {
	Engine(int val) {
		super(val);
		
	}
	String s=this.model;
	void drive() {
		System.out.println(s);
		super.run();
		System.out.println("Drives the car.");
	}
}
