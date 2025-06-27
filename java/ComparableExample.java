import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		list.add(new Student("ccc",90,15));
		list.add(new Student("zzz",75,35));
		list.add(new Student("ddd",80,55));
		
		System.out.println(list.toString());
		
		Collections.sort(list,new compareList());
		
		System.out.println(list.toString());
		
	}

}

class compareList implements Comparator<Student> {
	   
	   public int compare(Student s1,Student s2) {
		   return s1.name.compareTo(s2.name);
	   }

	
}

class Student {
	String name;
	int mark;
	int age;
	
	Student(String name,int mark,int age) {
		this.name=name;
		this.mark=mark;
		this.age=age;
	}
	
	public String toString() {
		return name+" "+mark+" "+age;
	}
}