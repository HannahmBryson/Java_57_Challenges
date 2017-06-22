import java.util.Scanner;

class Characters {
	
	public static void main(String args [])
	{
		// Asking user for input 
		System.out.println("What is the input string ?");
		
		//recording user input
		
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.next();

		//Working out the number of characters and Printing out result
		System.out.println(input+ " has "+ input.length()+ " characters");
		
	}
}
