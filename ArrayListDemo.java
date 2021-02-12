package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
//		List<Integer> l1=new ArrayList<>();
//		l1.add(1);
//		l1.add(0);
//		l1.add(100);
//		l1.add(99);
//		l1.add(15);
//		List<Employee> l1=new ArrayList<>();
//		l1.add(new Employee(2,"Aniket",35000.0));
//		l1.add(new Employee(1,"Lucifer",35100.0));
//		l1.add(new Employee(6,"Anita",39000.0));
//		l1.add(new Employee(5,"Solanki",32000.0));
//		l1.add(new Employee(3,"Roger",30000.0));
//		System.out.println(l1);
//		Collections.sort(l1);
//		System.out.println(l1);
		List<Employee> ll1=new LinkedList<>();
		ll1.add(new Employee(2,"Aniket",35000.0));
		ll1.add(new Employee(1,"Lucifer",35100.0));
		ll1.add(new Employee(6,"Anita",39000.0));
		ll1.add(new Employee(5,"Solanki",32000.0));
		ll1.add(new Employee(3,"Roger",30000.0));
		System.out.println(ll1);
		Collections.sort(ll1,new SalaryComaparator());
		System.out.println(ll1);
	}

}
