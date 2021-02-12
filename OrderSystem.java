package problemAssign;

import java.util.*;

public class OrderSystem {
	int quantity;
	String product;
	String type;
	double price;
	Map<String,Integer> durable=new HashMap<String,Integer>();
	Map<String,Integer> consummable=new HashMap<String,Integer>();





	public OrderSystem(int quantity, String product, String type, double price) {
		super();
		this.quantity = quantity;
		this.product = product;
		this.type = type;
		this.price = price;
	}
	
	

}
