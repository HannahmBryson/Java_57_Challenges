import java.util.Scanner;

class HelloWorld {

	public static void main(String args[])
	{
	// Asking user for input
	System.out.println("Hi, What is your name?");
	
	// Recording user input
	Scanner myScanner = new Scanner(System.in);
	String name = myScanner.next();
	
	//Printing out input
	System.out.println("Hi "+ name + ", nice to meet you");
	}
}
