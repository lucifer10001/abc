package Collection;

import java.util.Comparator;

public class SalaryComaparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o2.getSalary().compareTo(o1.getSalary());
	}

}
