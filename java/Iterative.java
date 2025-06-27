public class Iterative {
    public static void main(String[] args) {
    	
    	int w=1;
    	while(w<1) 
    	System.out.println(w+"while");
    	
    	int i=1;
    	
    	do  {
    		System.out.println(i+"do-while");
    	}while(i>1);
    	
   
    	//for( ; ;)  // infinite loop
    	
    	for(int j=1,k=1,l=1;j<=10;j++,k--)
    	System.out.println(j+"..for.."+k);
    	
    	 byte b=1;
    	
    	for(;b<5;)
    	System.out.println(b--);
    	
    	
    }
}
