package assessment3;

import java.util.Scanner;

public class ForLoopPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
				for(int k=n; k>=i; k--)
				{
					System.out.print("*");
				}
		System.out.println();
		}		
	}

}
