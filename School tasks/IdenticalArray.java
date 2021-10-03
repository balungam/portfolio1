

import java.util.Scanner;
import java.util.Arrays;

public class IdenticalArray {
	public static void main(String[] args) {
		
		//this program will ask the user for numbers to create two arrays,
		//we will then ask program to compare if the two arrays are identical or not.
		
		//i started by creating two arrays of the same length.
		int[] firstArray = new int[5];
		int[] secondArray = new int[5];
	
		//i asked the user to input the numbers for the firstArray.
		System.out.println("Enter "+ firstArray.length +" numbers for the first Array");
		Scanner numb1 = new Scanner(System.in);
		for(int i = 0; i < firstArray.length; i++) {
			
			firstArray[i] = numb1.nextInt();
				
		}
		//i used the "Arrays" method to out the firstArray.
		System.out.println("First array" + Arrays.toString(firstArray));
		
		//i asked the user to input numbers for the secondArray
		System.out.println("Enter "+ secondArray.length +" numbers for the second Array");
		Scanner numb2 = new Scanner(System.in);
		for(int i = 0; i < secondArray.length; i++) {
			
			secondArray[i] = numb2.nextInt();
				
		}
		System.out.println("The first Array" + Arrays.toString(firstArray) + "\n");
		System.out.println("Second Array" + Arrays.toString(secondArray) + "\n");
		
		//i used the Array method to compare the two arrays. 
		if(Arrays.equals(firstArray, secondArray)) {
			
			System.out.println("The two arrays are identical");
		} else {
			System.out.println("The two arrays are not identical");
		}
		
		
}


		}	
		
	

