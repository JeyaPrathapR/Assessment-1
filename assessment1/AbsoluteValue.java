package assessment1;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args)
	
	{
		Scanner abs=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int value=abs.nextInt();

		if(value<0)
		{
		System.out.println("The Absolute value is : "+value + " is "  +(-value));			
		}
		else
		{
			System.out.println("The Absolute value is : "+value + " is "  +value);
		}
		
	}	
}
