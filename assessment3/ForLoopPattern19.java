package assessment3;

import java.util.Scanner;

public class ForLoopPattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int i,j = 1;
		
		for(i=1; i<=n; i++)
		{
			System.out.print(j + " ");
			j+=3;
		}
	}

}
