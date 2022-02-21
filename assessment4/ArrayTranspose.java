package assessment4;

import java.util.Scanner;

public class ArrayTranspose {

	 public static void main(String args[]) {
		   
		 int row, col;
		 Scanner sc = new Scanner(System.in);

		    System.out.print("Input number of rows: ");
		    row = sc.nextInt();

		    System.out.print("Input number of columns: ");
		    col = sc.nextInt();

		    int a[][] = new int[row][col];


		    System.out.println("Enter the elements:");
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
		        System.out.print("Element [" + (i + 1) + "," + (j + 1) + "] : ");
		        a[i][j] = sc.nextInt();
		      }
		    }
		    System.out.println();

		    System.out.println("Entered Matrix: ");
		  
		    for (int i = 0; i < row; i++) {
		      for (int j = 0; j < col; j++) {
		        System.out.print(a[i][j] + "   ");
		      }
		      System.out.println();
		      System.out.println();
		    }

		    System.out.println("Transpose Matrix: ");
		    for (int i = 0; i < col; i++) {
		      for (int j = 0; j < row; j++) {
		        System.out.print(a[j][i] + "   ");
		      }
		      System.out.println();
		      System.out.println();
		    }
	    }
	}
