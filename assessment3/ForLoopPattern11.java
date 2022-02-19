package assessment3;

import java.util.Scanner;

public class ForLoopPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
			System.out.print("*");
			}
			System.out.println();		
		}
		
	}

}
