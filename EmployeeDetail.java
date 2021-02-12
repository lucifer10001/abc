package day_5;

public abstract class EmployeeDetail {
	int id;
	String Name;
	int tLeave=2;
	
	public EmployeeDetail(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public abstract int calculateSal(int sal);
	public void deductLeave(){
		if(tLeave==0)
			System.out.println("No leaves will be provided anymore");
		else
			tLeave--;		
	}
	
}
