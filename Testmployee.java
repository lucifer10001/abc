package day_5;

public class Testmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractEmployee cE1=new ContractEmployee(1,"Lucifer",500);
		System.out.println(cE1);
		cE1.deductLeave();
		cE1.deductLeave();
		System.out.println(cE1);
		System.out.println(cE1.calculateSal(500));
		RegularEmployee rE1=new RegularEmployee(1,"Roger",500);
		System.out.println(rE1);
		System.out.println(rE1.calculateSal(500));
		System.out.println(rE1.calculateSal(400));
	}

}
