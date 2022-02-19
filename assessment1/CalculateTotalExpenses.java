package assessment1;

import java.util.Scanner;

public class CalculateTotalExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner expense=new Scanner(System.in);
		System.out.println("Enter the Quantity:");
		int quantity=expense.nextInt();

		System.out.println("Enter the Price of Items:");
		float price=expense.nextFloat();
		
		float total = quantity*price;
		System.out.println("Total Cost is" +total);
		
		if(total>=5000)
		{
			float discount = total/10;
			System.out.println("You Have Discount:" +discount);
			System.out.println("You Have to Pay" +(total-discount));
		}
		else
		{
			System.out.println("You have to buy 5000 or above to get Discount");
			System.out.println("You have to Pay" +total);
	}
	}	

}