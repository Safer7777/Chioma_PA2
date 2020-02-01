//This class when called will bring us here to begin the decryption process
public class Decrypter {
	
	public static int decrypt (int number) {

		//Grab the numbers from the main method and bring them here for decryption
		int num1, num2, num3, num4;

		//This section allows us to swap each value
		 num1 =  number / 1000;
		 num2 = (number % 1000) / 100;
		 num3 = (number % 100) / 10;
		 num4 =  number % 10;

		//This section allows us to actually decrypt the encrypted values
		 num1 = (num1 + 3) % 10;
		 num2 = (num2 + 3) % 10;
		 num3 = (num3 + 3) % 10;
		 num4 = (num4 + 3) % 10;

		//Now we will return the successfully decrypted number
		 return (num3 * 1000 + num4 * 100 + num1 * 10 + num2);

	}
}
