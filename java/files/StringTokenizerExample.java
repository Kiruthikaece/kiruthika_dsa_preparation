package files;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String s="$Hardwork $only $Way $to $success";
		
		StringTokenizer  str=new StringTokenizer(s,"$");
			
		while(str.hasMoreTokens()) {
			System.out.print(str.nextElement());
		}
	}

}
