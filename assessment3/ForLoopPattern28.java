package assessment3;

import java.util.Scanner;

public class ForLoopPattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		int i, j;
		
		for(i=1;i<=n;i++)
		{	
			j = i*i;
			System.out.print(j +" ");
		}
	}

}
