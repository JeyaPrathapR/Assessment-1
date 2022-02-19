package assessment1;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		
		Scanner number=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=number.nextInt();
		
		if(num%2==0)
		{
			System.out.println("The Number is Even");
		}

		else
			System.out.println("The Number is odd");
	}
	
}
