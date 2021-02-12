
public class Client {

	public static void main(String[] args) {
		Book i1=new Book(12,"Java", 500,"Sumita Arora");
		i1.print();
		i1.checkIn();
		i1.print();
		Book i2=new Book(123,"Java", 500,"Sumita Arora");
		System.out.println(i1.equals(i2));
		JournalPaper j1=new JournalPaper(321,"Machine learning",2,"abc",2020);
		j1.print();
		Video v1=new Video(120,"Emi","XYZ",2015);
		v1.print();
		CD c1=new CD(360,"Roger","ABC");
		c1.print();
	}

}
