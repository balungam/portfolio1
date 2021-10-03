
import java.util.Arrays;
import java.util.Scanner;

public class sumElements {

	public static void main(String[] args) {

		//this program will ask the user to input a 3-by-4 array,
		//it will then calculate the sum of all the columns.
		
		//i created a one dimensional array and a two dimensional array.
		double totalRow = 0;
		double[][] matrix = new double[3][4];
		
		
		//i asked the user to input the numbers for the arrays.
		System.out.println("Enter a 3-by-4 array");
		Scanner numb = new Scanner(System.in);
		
		//i then add the numbers to the two dimensional array.
		for(int row = 0; row < matrix.length; row++) {
			for(int col = 0; col < matrix[0].length; col++) {
				matrix[row][col] = numb.nextDouble();
			}
			
		}
		//i added the numbers to the array totalRow and created an array totalCol
		double[] totalCol =new double[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				totalRow += matrix[i][j];
				totalCol[j] += matrix[i][j];
				
			}	
		}

		//i used the for loop to calculate the sum of numbers in each column.
		for(int col = 0; col < matrix[0].length; col++) {
			int colSum = 0;
			for(int row = 0; row < matrix.length; row++) {
				colSum += matrix[row][col];
			}
			System.out.println("Sum of the elements at col" + col + " is: " + colSum);
		}
		
						
		}
				

	}
	


