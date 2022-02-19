package assessment1;

import java.util.Scanner;

public class TriangleValidorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner triangle = new Scanner(System.in);
		System.out.println("Enter First Angle:");
		int firstAngle= triangle.nextInt();
		System.out.println("Enter second Angle:");
		int secondAngle= triangle.nextInt();
		System.out.println("Enter third Angle:");
		int thirdAngle= triangle.nextInt();
		
		int totalAngle = firstAngle+secondAngle+thirdAngle;
	
		if(totalAngle==180)
		{
			
			System.out.println("Triangle is Valid");
		}
		
		else
			System.out.println("Triangle is Not Valid");
	}
}
