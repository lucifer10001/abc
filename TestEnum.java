package enum_IO;

enum Color{
	RED,BLUE,GREEN,WHITE;
}
public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color arr[] = Color.values();
		for(Color co:arr)
		System.out.println(co+" "+co.ordinal());

	}

}
