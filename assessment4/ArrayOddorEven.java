package assessment4;

import java.util.Scanner;
public class ArrayOddorEven
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        
        System.out.println("Enter Mentioned Number of elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        System.out.print("Odd numbers are:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 != 0)
            {
                System.out.print(a[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even numbers are:");
        for(int i = 0 ; i < n ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}



/*
 * int ar[]={67,43,23,12,34,56,76,45};
 * int even[]=new int[ar.length];
 * int odd[]=new int[ar.length];
 * 
 * int e=0; o=0;
 * for(int i=0l i<ar.length; i++)
 * {
 * if(ar[i]%2==0)
 * {
 * even[e]=ar[i];
 * e++;
 * }
 * else
 * {
 * odd[o]=ar[i];
 * o++;
 * }
 * }
 * sys.out.println("Even array: ");
 * for(int i=0;i<even.length;i++;
 * {
 * Sys.out.print(even[i]+" ");
 * }
 * Sys.out.println();
 *Sys.out.println("Odd Array");
 *for(int i=0;i<odd.length;i++)
 *{
 *Sys.out.print(odd[i]+" ");
 *}
 *} 
 * 
 */



