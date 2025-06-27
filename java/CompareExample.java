import java.util.*;

public class CompareExample {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("pop",20000,33));
		list.add(new Employee("Ak",90000,45));
		list.add(new Employee("pkk",90000,60));
		
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println(list);
	}

}


class Employee implements Comparable<Employee> {
	String name;
	long salary;
	int age;
	
	Employee(String name,long salary,int age) {
		this.name=name;
		this.salary=salary;
		this.age=age;
	}
	
	public int compareTo(Employee e) {
		
		
			return e.age- age;
		
//		if(this.salary!=e.salary) 
//			return Long.compare(this.salary,e.salary);
//		else if(this.age!=e.age)
//			return this.age-e.age;
//		else
//		return this.name.compareTo(e.name);
	}
	public String toString() {
		return name +"-"+age+"-"+salary;
		
	}
}