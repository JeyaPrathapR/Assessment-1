package assessment1;

import java.util.Scanner;

public class ProfitorLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner expense=new Scanner(System.in);
		System.out.println("Enter the costprice:");
		double costPrice=expense.nextDouble();
		System.out.println("Enter the Sellingprice:");
		double sellingPrice=expense.nextDouble();

		double profit = sellingPrice-costPrice;
		double loss = costPrice-sellingPrice;
		
		
	if(profit>0)
			{
			System.out.println("profit is: " +profit);
			}
		else if(profit<0)
		{
			System.out.println("Loss is: " +loss);					
			}
		else 
			System.out.println("Neutral");			
	
	}

}