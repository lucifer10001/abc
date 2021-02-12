package day8;

import java.util.ArrayList;
import java.util.Collections;

public class ArratList1  {

	public static void main(String[] args) {
		ArrayList<Fruit> l1=new ArrayList<>();
		Fruit f1=new Fruit(12,"Apple",9);
		l1.add(f1);
		l1.add(new Fruit(1,"banana",3));
		for(Fruit f:l1) {
			System.out.println(f.equals(new Fruit(3,"Apple",2)));
		}
		Collections.sort(l1);
		
		for(Fruit f:l1) {
			System.out.println(f);
		}
		Collections.sort(l1,new ComparatorExample());
		for(Fruit f:l1) {
			System.out.println(f);
		}
	}

}
