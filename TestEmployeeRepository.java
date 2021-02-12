package day9_thread;

import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;



public class TestEmployeeRepository {
	
	static EmployeeRepository repository;
	
	@BeforeClass
	public static void setup() {
		repository = new EmployeeRepository();
	}

	@Test
	public void testFindAllEmployees() {
		List<Employee> employees = repository.findAllEmployees();
		System.out.println(employees);
		assertSame(3, employees.size());
	}
	
//	@Test
	public void testAddEmployee() {
		Employee emp = new Employee(23, "Rahul", 34343.34);
		int count = repository.addEmployee(emp);
		assertSame(1, count);
	}
	
	
	// Delete a employee by id
	
	// Find a employee be id;
	
	// Update the name of the employee

}