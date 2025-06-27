
public class ShapesDemo {

	public static void main(String[] args) {
		
//		   Shapes s=new Shapes(10,20);
//		   System.out.println(s.area());
		   
		   Shapes s1=new Square(10,20);
//		   System.out.println(s1.area());
//		   System.out.println(s1.name);
//		   s1.printWidth();
		  
		   
		   Square s=(Square)s1;
		   System.out.println(s.perimeter());
		   s.printWidth();
		   System.out.println(s.area());
		   System.out.println(s.width);
		   System.out.println(s.name);
		   
		   
	}

}


class  Shapes {
	int width;
	int height;
	String name="llll";
	Shapes(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int area() {
		System.out.println("Parent method");
		return width*height;
	}
	
	public void printWidth() {
		System.out.println("Parent method");
		System.out.println("width"+width);
	}
}

class Square extends Shapes {
	
	
	Square(int width, int height) {
		super(width, height);
	}

	int width=200;
	String names="uuu";
	
	public int area() {
		System.out.println("child method");
		return width*width;
	}
	
	public int perimeter() {
		System.out.println("child method");
		return 4*width;
	}
}