package assessment3;

import java.util.Scanner;

public class ForLoopPattern5 
{

	public static void main(String[] args)
	{
		
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
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
