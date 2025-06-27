package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		
		
		list.add(new Employee("xxxx",10005,10000));
		list.add(new Employee("Diviya",10003,200));
		list.add(new Employee("Priya",10001,500000));
		
		System.out.println("Before sort");
		System.out.println(list.toString());
		Collections.sort(list);
		System.out.println("After sort");
		System.out.println(list.toString());
	}

}


class Employee implements Comparable<Employee>{
	String name;
	int eId;
	int salary;
	
	Employee(String name,int eId,int salary) {
		this.name=name;
		this.eId=eId;
		this.salary=salary;
	}
	
	public String toString() {
		return "Employee name:"+name+"  Employee id:"+eId+"  salary:"+salary;
	}

	@Override
	public int compareTo(Employee e) {
		if(this.salary!=e.salary)
			return Integer.compare(this.salary,e.salary);
		else 
			return this.name.compareTo(e.name);
	}
}