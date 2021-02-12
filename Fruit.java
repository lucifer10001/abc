package day8;

public class Fruit implements Comparable<Fruit> {
	int quantity;
	String name;
	int price;
	
	public Fruit(int quantity, String name, int price) {
		super();
		this.quantity = quantity;
		this.name = name;
		this.price = price;
	}
	public boolean equals(Fruit obj) {
		if(this.name.equals(obj.name) &&this.price==obj.price) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Fruit [quantity=" + quantity + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Fruit o) {
		return this.price - o.price;
		
	}

	 

}
