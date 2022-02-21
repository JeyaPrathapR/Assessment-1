package assessment4;

public class ArrayPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char ch[] = {'C','O','B','O','L'};
		
		for(int i=0; i<ch.length;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch[j]);
			}
			
			System.out.println();		
		}
		
		for(int i=ch.length-2; i>=0;i--)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(ch[j]);
			}
		System.out.println();
		}
		
	}

}
