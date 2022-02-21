package assessment4;

import java.util.Arrays;

public class ArrayRepetitiveNumber {

		public static void main (String[] args) {
			
			int ar[] = {1,5,2,1,7,3,1,8};
			Arrays.sort(ar);// sort array in ascending order
			
			int max_count=1;
			int num = ar[0];
			int current_count=1;
			
			for(int i=1; i<ar.length; i++)
			{
				if(ar[i]==ar[i-1])
				{
					current_count++;
				}
				else
				{
					if(current_count>max_count)
					{
						max_count=current_count;
						num=ar[i-1];
					}
				current_count=1;
				}
				
			}
			
			if(current_count>max_count)
			{
				max_count=current_count;
				num=ar[ar.length-1];
			}
			
			System.out.println("repeated number is:" +num);
		}
	}




