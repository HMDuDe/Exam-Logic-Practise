package examprep;

import javax.swing.JOptionPane;

public class Excersises {

	//Capitalize the first letter of each word in a given string
	public String printCapitalized(String original) {
		String updatedString = "";
		String[] arr = new String[original.length()];
		
		arr = original.split("");
		arr[0] = arr[0].toUpperCase();
		
		updatedString = "" + arr[0];
		
		for(int i = 1; i <= original.length()-1;i++) {
			
			if(arr[i].equals(" ")) {
				arr[i + 1] = arr[i + 1].toUpperCase();
				updatedString += arr[i];
				
			}else {
				updatedString += arr[i];
			}
		}
		
		return updatedString;
	}
	
	//Method that reverses a given string
	public String reverse(String original) {
		String updated = "";
		
		for(int i = original.length() - 1; i >= 0 ;i--) {
			updated += original.charAt(i);
		}
		
		return updated;
	}
	
	//Method that takes a user entered integer and displays a square of asterisks with that integer as the width and length
	public void displaySquare(int dimension) {
		for(int i = 1; i <= dimension; i++) {
			for(int j = 1; j < dimension; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	/*Method that allows user to enter 20 numbers and calculates the average of all even numbers entered. program terminates 
	once 15 even numbers has been entered and displays message if no even numbers are entered.*/
	public void evenNumbers() {
		double average = 0;
		int numEntered, numEvenNumbers = 0, total = 0;
		
		
		for(int i = 0; i < 20; i++) {
			numEntered = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
			
			if(numEntered % 2 == 0) {
				total += numEntered;
				
				numEvenNumbers++;
			}
			
			if(numEvenNumbers == 15) {
				i = 21;
			}
		}
		
		if(numEvenNumbers == 0) {
			System.out.println("No even numbers to calculate average");
		}else {
			System.out.println("Average: " + total/numEvenNumbers);
		}
	}
	
	//Method that receives an int value and creates a symmetric pyramid where the int received represents the number of levels.
	 public void makePyramid(int n) 
	    { 
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for (int i=0; i<n; i++) 
	        { 
	  
	            // inner loop to handle number spaces 
	            // values changing acc. to requirement 
	            for (int j=n-i; j>1; j--) 
	            { 
	                // printing spaces 
	                System.out.print(" "); 
	            } 
	   
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop 
	            for (int j=0; j<=i; j++ ) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	   
	            // ending line after each row 
	            System.out.println(); 
	        }
	    }
	 
	public static void main(String[] args) {
		Excersises test = new Excersises();
		
		System.out.println(test.printCapitalized("pearson  institute of higher  education"));
		System.out.println(test.reverse("Boogies"));
		test.displaySquare(3);
		//test.evenNumbers();
		test.makePyramid(3);
		
	}

}
