	package day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(20, "Ravi", 34343.34);
		Employee e2 = new Employee(2, "Priya", 44343.34);
		Employee e3 = new Employee(12, "Arijit", 24343.34);
		Employee e4 = e1;
		Set<Employee> s1=new HashSet<>();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(new Employee(20,"Ravi",34343.34));
		s1.add(e4);
		System.out.println(s1.size());
		List<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(new Employee(20,"Ravi",34343.34));
		l1.add(e4);
		System.out.println(l1.size());
	}

}
