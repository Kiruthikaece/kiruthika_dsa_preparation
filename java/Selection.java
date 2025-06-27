
public class Selection {

	public static void main(String[] args) {
		
	    int no=10;
	    
	    if(false) 
	    	System.out.println("Number less than 15");  //CONTRADICITION
	    
	    if(true)
	    System.out.println("Number less than 15");  //Tautology
	    
	    
	    if(no<17)									// else-if order is important
	    	System.out.println("Number less than 15");  
	    else if(no<20)
	    	System.out.println("Number less than 20");
	    else
	    	System.out.println("Number less than 20");
	    
	    	
	    
	    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
	    
	    Day day=Day.MONDAY;
	    
	    switch(day) {
	    case TUESDAY: 
	    	System.out.println("Tuesday");
	    				break;
	    				
	    case MONDAY:
	    	System.out.println("MONDAY");
			break;
	    }
	    
	    int a=10,b=5,c=20;
		
		
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max);
		
		int max2=Math.max(c,Math.max(a, b));
		System.out.println(max2);
		
		
		
				//int k = 2;
//				switch (k) {
//				case 'a':
//					System.out.println("Welcome");
//				case 2:
//					System.out.println("To");
//				case 'b':
//					System.out.println("Infosys");
//					break;
//				default:
//					System.out.println("Hello");
//			
//		}
				
//				int k = 1;
//				switch (k) {
//				default:
//					System.out.println("Have");
//				case 'a':
//					System.out.println("A");
//				case 'b':
//					System.out.println("Good Day");
//				}

		
		int k = 1;
		switch (k) {
		default:
			System.out.println("Hello");
		case 1:
			System.out.println("Welcome");
		case 2:
			System.out.println("To");
		case 3:
			System.out.println("Infosys");
			break;
		}
	}
	
	
	
}
