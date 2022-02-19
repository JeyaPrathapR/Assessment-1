package assessment3;

import java.util.Scanner;

public class ForLoopPattern14 {

	public static void main(String[] args)
	{
		
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || j==n-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
			}
	}
	
}
