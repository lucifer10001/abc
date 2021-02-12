package day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
	
//		Stream questions:
//		    1. Find total count of books with rating greater than 4.7. Hint use terminal operation count()
		Long count1= books.stream()
				.filter(b->b.getRating() >4.7)
				.count();
		System.out.println("Total Books Greator than 4.7==>"+count1);
//		    2. Check if all books match this criteria. (b) -> b.getRating()>= 1.1. Hint use allMatch
		
			Boolean mat=books.stream().allMatch(b->b.getRating()>=1.1);
			
			System.out.println("Is all books have rating greator than 1.1->"+mat);
//		    3. Print only the titles of the book. Hint use map to convert to String
			System.out.println("Title of all books are:-" );
			books.stream()
			.map(b-> {
				return b.getTitle();
			})
			.distinct()
			.forEach((b)->System.out.println(b));
//		    4. Find all books containing title string "Java 11". Hint use filter function 
			System.out.print("Book with title Java 11:-" );
			books.stream()
			.filter(b->b.getTitle().equals("Java 11"))
			.forEach((b)->System.out.println(b));
//		    5. Sort books by rating. Hint use terminal function .sorted()
			books.stream().sorted((b1,b2)->b1.getRating().compareTo(b2.getRating()).forEach((b)->System.out.println(b));
			System.out.print("Sorted books as per rating-" );
			books.stream()
			.sorted(Comparator.comparing(Book::getRating))
			.forEach((b)->System.out.println(b));
//		    6. Find book with minimum rating. Hint use .min() instead of .sorted()
			Book minBook=books.stream()
			.min(Comparator.comparing(Book::getRating)).get();
			System.out.println("Minimus rating is of book="+minBook);
//		    7. Find the maximum rating value in the whole list. No Hints
			Book maxBook=books.stream()
					.max(Comparator.comparing(Book::getRating)).get();
					System.out.println("Maximum rating is of book="+maxBook);


	}
}
