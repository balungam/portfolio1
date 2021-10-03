

public class grades {

	public static void main(String[] args) {

		//This program will give a user/student a grading symbol,
		//according to the average grades.
		
		//firstly i created an array.
		int[] myTestResults = new int[5];
		
		//this is a list of the fictitious test scores.
		myTestResults[0] = 80;
		myTestResults[1] = 20;
		myTestResults[2] = 56;
		myTestResults[3] = 80;
		myTestResults[4] = 80;
		
		//i created an empty variable.
		//i used the for loop to create a sum of the 
		int total = 0;
		
		for(int num : myTestResults) {
			total = total+num;
		}
	
		
		//this is a calculation for the average amounts per grade.
		int finalResult =  total/5;
		
		//i used if statements to print out the correct grading,
		//depending on the average total grade.
		if(finalResult >= 80 && finalResult <= 100) {
			System.out.println("The average grade is " + finalResult + "% Final mark A");
		} else if(finalResult >= 70 && finalResult <= 79) {
			System.out.println("The average grade is " + finalResult + "% Final mark B");
		} else if(finalResult >= 60 && finalResult <= 69) {
			System.out.println("The average grade is " + finalResult + "% Final mark C");
		} else if(finalResult >= 50 && finalResult <= 59) {
			System.out.println("The average grade is " + finalResult + "% Final mark D");
		} else if(finalResult <= 49) {
			System.out.println("The average grade is " + finalResult + "% Final mark F");
		}
		

	}

}
