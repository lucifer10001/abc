package day_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static boolean validPassword(String st) {
		String regex = "^(?=.*[0-9])"+ "(?=.*[a-z])(?=.*[A-Z])"+ "(?=.*[@#$%^&+=])"+ "(?=\\S+$).{8,20}$";
		Pattern pattern=Pattern.compile(regex);//regular expression
		Matcher match=pattern.matcher(st);// input string to match
		return match.matches();
	}
	public static boolean validEmail(String st) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern=Pattern.compile(regex);//regular expression
		Matcher match=pattern.matcher(st);// input string to match
		return match.matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(validPassword("Anikey@123"));
		System.out.println(validEmail("aniket.soalnki@gmail.co.w.m"));
	}

}
