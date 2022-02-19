package assessment1;

import java.util.Scanner;

public class YoungestofThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner age=new Scanner(System.in);
		System.out.println("Enter Age of Ram:");
		int ramAge=age.nextInt();
		System.out.println("Enter Age of Sulabh:");
		int sulabhAge=age.nextInt();
		System.out.println("Enter Age of Ajay:");
		int ajayAge=age.nextInt();
		
		if(ramAge<ajayAge && ramAge<sulabhAge)
		{
		
			System.out.println("Ram is Youngest");
		}
		
		else if(sulabhAge<ajayAge)
		{
			System.out.println("Sulabh is Youngest");
		}
		else
		 	System.out.println("Ajay is Youngest");
	
}

}