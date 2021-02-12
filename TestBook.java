package day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TestBook {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		books.addAll(DataExtractor.getFromAmazon("java"));
		books.addAll(DataExtractor.getFromBarnesAndNoble("java"));
		
		// Imperative
//		int count = 0;
//		for(Book b: books) {
//			System.out.println(b);
//			count ++;
//			if(count>2) break;
//		}
		
//		System.out.println( " -----    Declarative syntax   ------ ");
//		// Declarative
		
		

		
//		boolean anyMatch = books.stream()
//		.count(b) -> b.getRating()>4.7
//		.forEach(b)-> System.out.println();
//		//.anyMatch((b) -> b.getRating()> 4.9) ;
//		System.out.println("Any books matching rating > 4.8 " + anyMatch);
	
//		Stream questions:
//		    1. Find total count of books with rating greater than 4.7. Hint use terminal operation count()
		Long count1= books.stream()
				.filter(b->b.getRating() >4.7)
				.count();
		System.out.println(count1);
//		    2. Check if all books match this criteria. (b) -> b.getRating()>= 1.1. Hint use allMatch
		
			Boolean mat=books.stream().allMatch(b->b.getRating()>=1.1);
			System.out.println(mat);
//		    3. Print only the titles of the book. Hint use map to convert to String
			books.stream()
			.map(b-> {
				return b.getTitle();
			})
			.distinct()
			.forEach((b)->System.out.println(b));
//		    4. Find all books containing title string "Java 11". Hint use filter function 
			books.stream()
			.filter(b->b.getTitle().equals("Java 11"))
			.forEach((b)->System.out.println(b));
//		    5. Sort books by rating. Hint use terminal function .sorted()
			books.stream()
			.sorted(Comparator.comparing(Book::getRating))
			.forEach((b)->System.out.println(b));
//		    6. Find book with minimum rating. Hint use .min() instead of .sorted()
			Book minBook=books.stream()
			.min(Comparator.comparing(Book::getRating)).get();
			System.out.println(minBook);
//		    7. Find the maximum rating value in the whole list. No Hints
			Book maxBook=books.stream()
					.max(Comparator.comparing(Book::getRating)).get();
					System.out.println(maxBook);
//		Optional<Book> bookFound = books.stream()
//		.skip(10)
//		.distinct()
//		.filter((b) -> b.getRating()> 4.5)
//		.findAny();
////		.forEach((b)->System.out.println(b));
////		
//		if(bookFound.isPresent()) {
//			System.out.println(bookFound.get());
//		}
////		else {
////			System.out.println("No matching book Found!!");
////		}

	}

}