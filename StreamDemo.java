package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import day_10.Employee;

public class StreamDemo {
	public static void main(String args[]) {
		Employee e1 = new Employee(1, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);

		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		Stream<Employee> stream=employees.stream();
		stream
		.filter(e->e.getName().startsWith("A"))
		.map(e->{
			e.incrementSalary();
			return e;
	})
		.forEach((e)->System.out.println(e));
		
		

	}
}
