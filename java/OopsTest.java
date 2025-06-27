
public class OopsTest {

	public static void main(String[] args) {
		  
		CarOops car1=new CarOops();
		car1.drive();
		
		CarOops car2=new CarOops();
		car2.drive();
		
		
		
	}

}

class CarOops {
	private String model;
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private int year;
	private String color;
	
	public void drive() {
		
		try {
			 if(year==0) {
				 System.out.println("year is invalid");
			 } 	
		}
		catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 System.out.println("drive the car");
		 }
		
	}
	
}

class Engine1 extends CarOops {
	
	public void start() {
		System.out.println("start the car..");
	}
	
	public void drive() {
		System.out.println("Engine is run");
	}
}


abstract class CarParts {
	abstract public void honk();
}


class CarImpl extends CarParts {
	public void honk() {
		System.out.println("honk the car");
	}
}
