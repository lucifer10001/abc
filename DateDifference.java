package problemAssign;

//Java program for the above approach 

import java.text.ParseException; 
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date; 

class DateDifference {
	static void findDifference(String start_date, 
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
			System.out.println( 
				difference_In_Years); 
		} 

		// Catch the Exception 
		catch (ParseException e) { 
			e.printStackTrace(); 
		} 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		// Given start Date 
		String start_date 
			= "10-01-2018"; 

		// Given end Date 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	    Date date = new Date();
		String end_date 
			= ""+formatter.format(date); 

		// Function Call 
		findDifference(start_date, end_date); 
	} 
} 

