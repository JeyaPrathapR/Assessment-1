package assessment3;

import java.util.Scanner;

public class ForLoopPattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=2*i-1;k++)
			{				
				if(k%2==1)
				{
					System.out.print(i);	
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
		
		for(int i=n-1; i>=1; i--)
		{
			for(int j=n-1; j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=(i *2)-1;k++)
			{				
				if(k%2==1)
				{
					System.out.print(i);	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		
		}
		
		
		
	}
		

}

