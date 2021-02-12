package day_5;

import java.util.Arrays;
import java.util.Scanner;

public class TempExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] ar=new int[15];
		double s=0;
		for(int i=0;i<15;i++) {
			ar[i]=sc.nextInt();
			s=s+ar[i];
		}
		for(int i=0;i<15;i++) {
			System.out.println((i+1)+" Temp="+ar[i]);
		}
		Arrays.sort(ar);
		System.out.println("Max Temp="+ar[14]);
		System.out.println("Average Temp="+s/15);
	}

}
