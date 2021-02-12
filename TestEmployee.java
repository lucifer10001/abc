package day_10;

import java.util.ArrayList;
import java.util.List;

import day9_thread.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(12, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		Employee e4 = new Employee(22, "Rffavi", 3324343.34);
		Employee e5 = new Employee(1, "Priywa",344343.34);
		Employee e6 = new Employee(11, "Aridfjit", 24343.34);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1); 
		employees.add(e2);
		employees.add(e3);
		employees.add(e4); 
		employees.add(e5);
		employees.add(e6);
		for(Employee e: employees) {
		if(e.getName().startsWith("A"))
			System.out.println(e);
		}
		System.out.println("Salaey greator");
		for(Employee e: employees) {
			if(e.getSalary()>30000)
				System.out.println(e);
			}

	}

}
