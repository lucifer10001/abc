package problemAssign;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SalesOrder extends OrderSystem{
	String date1="";
	public SalesOrder(int quantity, String product, Date i, String type, double price) {
		super(quantity, product,  type, price);
		// TODO Auto-generated constructor stub
		this.date1=""+i;
	}
//	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
//    Date date = new Date();
//	String currentDate 
//		= ""+formatter.format(date);
	public void  deductQuantity() throws ExpiredProduct,NotEnoughQuantity {
		if(!durable.containsKey(product) || (durable.get(product)<=quantity))
			throw new NotEnoughQuantity("This much quantity is not availaavle");
		else {
			durable.put(product, durable.get(product)-quantity);	
		}
	}
	public double totalPrice() {
		double total=0;
		double tax=price*0.05;
		total=price+tax;
		return total;
	}
	

}
