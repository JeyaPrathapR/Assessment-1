package assessment3;

import java.util.Scanner;

public class ForLoopPattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
			System.out.print(i+1);
			}
			else
			{
				System.out.print(i);
			}
				
			for(int j=1;j<=n;j++)
			{
			if(j>=n && i%2==1)
			{
				System.out.print(i+1);
			}		
			else
			{
				System.out.print(i);
			}
			
			}
			System.out.println();
	}

	}
}
