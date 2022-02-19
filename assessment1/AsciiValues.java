package assessment1;

import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args)
	{
		Scanner ascii = new Scanner(System.in);
		System.out.println("Enter the Character");
		int  character = ascii.nextInt();
		
		if(character>=65 && character<=95)
		{
			System.out.println("Alphabet Letters");
		}
		
		else if(character>=97 && character<=122)
		{
			System.out.println("Small Letter");
		}

		else if(character>=48 && character<=57)
		{
			System.out.println("Numbers");
		}
		else if((character>=0 && character<=47) || (character>=58 && character<=64) || (character>=91 && character<=96) || (character>=123 && character<=127))
		{
			System.out.println("Special Characters");
		}
	}
	
}
