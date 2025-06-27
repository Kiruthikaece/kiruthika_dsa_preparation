
public class EncapsulationExample {

	public static void main(String[] args) {
		
		Car22 car2=new Car22();
		car2.honk();
	}

}

class Car1 {
	
	String model;
	int year;
	
	public void drive() {
		System.out.println("Drive the car1 and honk car1");
	}
}

class Car22 {
	Car1 car1=new Car1();
	
	public void honk() {
		car1.drive();
	}
}