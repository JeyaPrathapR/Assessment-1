package assessment3;

import java.util.Scanner;

public class ForLoopPattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int j =5;
		
		for(int i=n; i>=1; i--)
		{
			System.out.print(j + " ");
			j *=2;
			
		}
	}

}
