package assessment1;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gross = new Scanner(System.in);
		System.out.println("Enter Basic Salary");
		double basicSalary = gross.nextDouble();
		
		if(basicSalary<1500) 
		{
		
			double houseRentAllowance = (basicSalary*10)/100;
			double dearnessAllowance = (basicSalary*90)/100;
			
			double grossSalary = basicSalary + houseRentAllowance + dearnessAllowance;
			System.out.println("Gross Salary:" +grossSalary);
			
		}
		
		else
		{
			double houseRentAllowance = 500;
			double dearnessAllowance = (basicSalary*98)/100;
			
			double grossSalary = basicSalary + houseRentAllowance + dearnessAllowance;
			System.out.println("Gross Salary:" +grossSalary);				
		}		
	
	}

}
