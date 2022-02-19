package assessment3;

import java.util.Scanner;

public class ForLoopPattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int i,j=1;
		
		for(i=1; i<=n; i++)
		{
			if(i==1)
			{
			System.out.print(j +" ");
			}
			else
			{
				j = i + j++;
				System.out.print(j + " ");
			}
			
		}
		
		
	}

}
