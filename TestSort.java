package day8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		Employee e1 = new Employee(20, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		ArrayList<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		
		System.out.println(e1.compareTo(e2));
		System.out.println("b".compareTo("a"));
		
		System.out.println(employees);
		
		Collections.sort(employees, new SalaryComparator());
		
		System.out.println(employees);
		Collections.sort(employees);
		System.out.println(employees);
	}

}
