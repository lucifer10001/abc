import java.util.Scanner;

public class PowerOfTwo {
	public static boolean checkNumber(int n) {
		int c=2;
		while(c<n+2) {
			if(n%c==0) {
				if(n==c)
					return true;
				
				else 
					c=c*2;
				}
			else
				c=c*2;
			
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input =");
		int n=sc.nextInt();
		System.out.print(checkNumber(n));

	}

}
