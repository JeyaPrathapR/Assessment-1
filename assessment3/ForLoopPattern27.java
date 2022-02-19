package assessment3;

import java.util.Scanner;

public class ForLoopPattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int j = 1;
		
		for(int i=1; i<=n; i++)
		{
			j = i * j++;
			System.out.print(j + " ");
		}
	}

}
