package assessment1;

import java.util.Scanner;

public class SubjectRanking {

	public static void main(String[] args) {

		Scanner subject = new Scanner(System.in);
		System.out.println("Enter Five Subject Marks");
		
		System.out.println("Enter Tamil Marks:");
		int tamil = subject.nextInt();
		System.out.println("Enter English Marks:");
		int english = subject.nextInt();
		System.out.println("Enter Maths Marks:");
		int maths = subject.nextInt();
		System.out.println("Enter Science Marks:");
		int science = subject.nextInt();
		System.out.println("Enter Social Marks:");
		int social = subject.nextInt();
	
		double total = tamil + english + maths + science + social;
		System.out.println("Total Mark:" +total);
		double percentage = total/5;
		System.out.println("percentage:" +percentage);

		if(percentage>=60)
		{
			System.out.println("First Divison");
		}
		
		else if(percentage>50 || percentage==59)
		{
			System.out.println("Second Divison");			
		}
		else if(percentage>40 || percentage==49)
		{
			System.out.println("Third Divison");
		}
		else
		{
			System.out.println("Fail");
		}
	
	
}

}