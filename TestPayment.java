package day_10;

public class TestPayment {

//	public void performNEFT() {
//		System.out.println("NEFT Payment");
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment pay=new NEFTPayment();
		pay.perform();
		Payment pay1=new RTGsPayment();
		pay1.perform();
		Payment pay2=()-> System.out.println("UPI Payment");
		pay2.perform();
		
		Calc cal=(int x, int y)->{return (x+y);};
		int res=cal.perform(5, 8);
		System.out.println(res);
		Calc cal1=(int x, int y)->{return (x*y);};
		int res1=cal1.perform(5, 8);
		System.out.println(res1);
	}

}
