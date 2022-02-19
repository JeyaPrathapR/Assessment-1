package assessment1;

import java.util.Scanner;

public class LeapYearorNot {

	public static void main(String[] args) {
		
		Scanner leap = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = leap.nextInt();
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
		System.out.println("Leap Year");			
		}
		
		else 
			System.out.println("Not Leap Year");
	}
	
}
