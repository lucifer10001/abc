package day_5;

public class ContractEmployee extends EmployeeDetail{
	

	int sal1=0;
	int sal=0;
	public ContractEmployee(int id, String name,int sal) {
		super(id, name);
		this.sal1=sal;
		this.sal=sal;
		// TODO Auto-generated constructor stub
	}
	@Override
	public int calculateSal(int sal) {
		sal1=sal1+sal;
		// TODO Auto-generated method stub
		return sal1;
	}
	@Override
	public String toString() {
		return "ContractEmployee [id=" + id + ", Name=" + Name + ", tLeave=" + tLeave +  "]";
	}

}
