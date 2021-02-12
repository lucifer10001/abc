package problemAssign;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PurchaseOrder extends OrderSystem {

	String date1="";
	public PurchaseOrder(int quantity, String product, Date date, String type, double price) {
		super(quantity, product, date, type, price);
		// TODO Auto-generated constructor stub
		this.date1=""+date;
	}
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
    Date date = new Date();
	String currentDate 
		= ""+formatter.format(date);
	public void  addQuantity() throws ExpiredProduct,NotEnoughQuantity {
		if(findDifference(date1,currentDate)>2) {
			 throw new ExpiredProduct("Product is expired we can't accept it.");  
		}
		if(!durable.containsKey(product))
			durable.put(product,quantity);
		else if(durable.containsKey(product)){
			durable.put(product, durable.get(product)+quantity);
		}
		else {
			throw new NotEnoughQuantity("");
		}
	}
	
	
	
	public static long findDifference(String start_date, 
			String end_date) 
{
	SimpleDateFormat sdf 
		= new SimpleDateFormat( 
			"dd-MM-yyyy");  
	try {
		Date d1 = sdf.parse(start_date); 
		Date d2 = sdf.parse(end_date);
		long difference_In_Time 
			= d2.getTime() - d1.getTime(); 
		long difference_In_Years 
			= (difference_In_Time 
			/ (1000l * 60 * 60 * 24 * 365)); 
		return
			difference_In_Years; 
	} 

	// Catch the Exception 
	catch (ParseException e) { 
		e.printStackTrace(); 
	}
	return 0; 
} 
	
	

}
