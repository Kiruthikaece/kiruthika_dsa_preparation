
 class ClassAndObject {
	 
	public static void main(String[] args) {
		
		 
		Car car1=new Car();
		car1.color="blue";
		
		Car car2=new Car();
		car2.color="green";
		
		car1=car2;
				
		System.out.println(car1.color);
		System.out.println(car2.color);
		
		System.out.println(car1+"car1");
		System.out.println(car2+"car2");
		
		
		System.out.println(car1.model="Nano");
		System.out.println(car1.year=2024);
		car1.honk();
		
//		System.out.println(car1.honk());
		System.out.println(car1.toString());
	}

}


class Car {
	String model;
	String color;
	int year;
	
	void drive() {
		System.out.println("Drive the car");
	}
	
	void honk() {
		System.out.println("Honking the car");
	}
}