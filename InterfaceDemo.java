package day_5;
interface Greeting{
	void hello();
	void test();
}
class France implements Greeting{
	public void hello() {
		System.out.println("hola");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
class Hindi implements Greeting{
	public void hello() {
		System.out.println("Radhe Radhe");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
public class InterfaceDemo {
	public static void main(String args[]) {
	France greet=new France();
	greet.hello();
	Hindi greet1=new Hindi();
	greet1.hello();
}
}
