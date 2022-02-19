package assessment3;

import java.util.Scanner;

public class ForLoopPattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int j;
		for(int i=2; i<=n+1;i++)
		{
			if(i%2==0)
			{
				j = (int) Math.pow(2,(i+1)/2);
				System.out.print(j + " ");
			}
			else
			{
				j = (int) Math.pow(3,i/2);
				System.out.print(j + " ");
			}
		}
	}

}
