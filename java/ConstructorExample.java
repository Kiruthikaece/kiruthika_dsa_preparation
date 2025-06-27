
public class ConstructorExample {

	public static void main(String[] args) {
		C c=new C(10,"CCC");
		c.Drunk();
		System.out.println(c.name+"..name");
	}
}

class A {
	
	int id;
	String name;
	
     A(int id,String name) {
    	 this.id=id;
    	 this.name=name;
     }
     
     public void Drunk() {
    	 System.out.println("Drunk carefully");
     }
}

class B extends A {

	B(int id, String name) {
		super(id, name);
	}
	
}

class C extends B {

	C(int id, String name) {
		super(id, name);
	}
}
