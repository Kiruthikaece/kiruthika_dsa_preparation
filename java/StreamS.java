import java.util.*;
import java.util.stream.Collectors;

public class StreamS {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(Arrays.asList("Tamil","English","Maths","Sci","Soc"));
		
		boolean res=list.stream().noneMatch(p->p.startsWith("S"));
				System.out.println(res);
		
		List<String> res1=list.stream().skip(4).collect(Collectors.toList());
		System.out.println(res1);
		
		long res2=list.stream().
				filter(p->p.length()>5).
				count();
		System.out.println(res2);
		

		Optional<String> res3=list.stream().findAny();
		System.out.println(res3);
	}
}



// anyMatch()- return true any one of the string is met the condition(true)

// allMatch()- return true all the string met condn

// noneMatch()- return true none of the list can't match the condnition

//collect(Collectors.asList())- return list 