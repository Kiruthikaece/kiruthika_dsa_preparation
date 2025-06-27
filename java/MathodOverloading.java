class aa {
	
	
    public void print(int a,Object b) {
        System.out.println("Method=1");
    }
    
    public void print(Object b,double a) {
        System.out.println("Method=2");
    }
    
    public final void print(int x) {
    	System.out.println("m-3");
    }
}

class bb extends aa {
	public final void print(int x,int y) {
		System.out.println("m-3");
	}
}

class MathodOverloading {
    public static void main(String[] args) {
//        aa a=new aa();
//        //a.print(10,22.5); //ambigious situation
    	
    	Vechicle v=new Vechicle();
    	v.run();
    }
}

