package assessment4;

public class ArrayPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch[] = {'H','E','L','L','O'};
		
		
		for(int i = 0; i<ch.length; i++)		
		{
			for(int j=0; j<=4-i; j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		
		for(int i = ch.length-2; i>=0; i--)		
		{
			for(char j=0; j<=4-i; j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		
	}

}
