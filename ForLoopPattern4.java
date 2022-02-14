package assessment2;

public class ForLoopPattern4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
//		int i, j;
//
//		for (i = 1; i <= 5; i++) 
//		{
//			System.out.print(i); //Print Star and newline
//
//		for (j = 0; j < 5; j++) 
//		{
//
//		if()
//
//		}
//
//			System.out.println();
//		}
		
		int k=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=5;j++)
			{
			if((i==1) && (j==3) || (j==3) && (i==5))
			{
			System.out.print( " " +k);
			}
			else if((i==2) && (j==2) || (i==2) && (j==4) || (i==4) && (j==2) || (i==4) && (j==4) || (i==3) && (j==1) || (i==3) && (j==5))
			{
				System.out.print( " " +k);				
			}
			
				
			else
			{
				System.out.print(" *");
				
			}			
		}
			
				System.out.println();
		}
	
	
	}

}
