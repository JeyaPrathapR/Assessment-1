package assessment3;

import java.util.Scanner;

public class ForLoopPattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner pattern = new Scanner(System.in);
		System.out.println("Enter Your Pattern Number:");
		int n = pattern.nextInt();
		
		int k=0,j=1,l;
		
		for(int i=1;i<=n;i++)
			{
				if(i<=1)
				l=i;
		
				else
					{
					l=k+j;
					k=j;
					j=l;
					}
		System.out.print(l +" ");
		}
	}

}
