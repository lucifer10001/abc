package day_5;

public class RegularEmployee extends EmployeeDetail {
	int sal1=0;
	

	public RegularEmployee(int id,String Name,int sal1) {
		super(id,Name);
		this.sal1 = sal1;
	}


	@Override
	public int calculateSal(int sal) {
		sal1=sal1+sal;
		return sal1;
	}


	@Override
	public String toString() {
		return "RegularEmployee [id=" + id + ", Name=" + Name + ", tLeave=" + tLeave + "]";
	}

}
