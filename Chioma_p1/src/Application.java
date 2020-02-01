//This library enables usage of the scanner method, allow us to get input from the user
import java.util.Scanner;

public class Application {

	//Main function to run the data encryption program
	public static void main(String[] args) {

		//Java makes use of the scanner function in order to read user input
		Scanner userInput = new Scanner (System.in);

		//Begin the program by asking for the user to input the number they wish to use with the program
		System.out.print("Welcome to the data encryption program!\n ");
		System.out.println("\nFirst enter the number that you would like to process : ");
		int integer = userInput.nextInt();

		//Next we will ask the user what they wish to do with the number
		System.out.print("Input 1 to encrypt number, otherwise input 2 to decrypt the number:\n ");
		int userChoice = userInput.nextInt();

		//Probably the easiest way to check the user option is a simple if//else statement
		//Check to see if the user selected the encrypt option
		if (userChoice == 1) {
			
			System.out.printf("The encrypted value is: %04d\n", Encrypter.encrypt(integer));
			
		} 
		
		//Check to see if the user selected the decrypt option
		else if (userChoice == 2){
			
			System.out.printf("The decrypted value is: %04d\n",  + Decrypter.decrypt(integer));

		}

		//Thank the user for using the program and end it.
		System.out.println("\nThank you for using the data encryption program!");

	}
}



