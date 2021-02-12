package day9_thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class IncrementSalaryTask implements Runnable{
	
	Employee employee;

	public IncrementSalaryTask(Employee employee) {
		super();
		this.employee = employee;
	}

	@Override
	public void run() {
		this.employee.incrementSalary();
		System.out.println(Thread.currentThread().getName());
		System.out.println(employee);	
	}
	
	
}

public class ConcurrencyDemo4 {
	
	public static void main(String[] args) {
		
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
		System.out.println(e);
		}
		ExecutorService service = Executors.newFixedThreadPool(12);
		
		for(Employee e: employees) {
			Runnable runnable = new IncrementSalaryTask(e);
			service.submit(runnable);
//			e.incrementSalary();
//			System.out.println(e);
		}
		
		service.shutdown();
		
	}

}
