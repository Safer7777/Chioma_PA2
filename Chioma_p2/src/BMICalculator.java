//This library enables usage of the scanner method, allow us to get input from the user
import java.util.Scanner;

public class BMICalculator {
	
	//Main function to run the BMI calculator
	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	// Here we will initialize all of the variables needed for the calculator
		private double height, weight, BMI;
		private int option;
		private String BMICategory;
		
		// We will use these variables to choose between which set of units we want
		// the BMI calculator to use
		private final int Standard = 1; //standard uses pound and inches
		private final int Metric = 2; //while metric uses kilograms and meters

	//Java makes use of the scanner function in order to read user input
	Scanner userInput = new Scanner(System.in);

	//The readUserData public instance needs to make use of both readUnitType and ReadMeasurementData methods
	public void readUserData() 
	
	{
		readUnitType();
		readMeasurementData(option);
	}
	
	//We use the readUnitType class to determine if we are about to receive metric or standard units of measurement
	private void readUnitType() 
	
	{
			System.out.print("Enter 1 if you would like to calculate your BMI with the standard system, otherwise enter 2 if you want to wish to use metric units: ");
			option = userInput.nextInt();
	}

	//This method is to allow us to determine which method to call based off of user input from the previous method
	private void readMeasurementData(int o)

	{
		if (o == Standard) readImperialData();
		else if (o == Metric) readMetricData();
	}
	
	//We get user input for pounds and inches for the standard system of units
	private void readImperialData()

	{
		System.out.print("Please input your weight in pounds (do not enter a negative value): ");
		getWeight();
		System.out.print("Please input your height in inches (do not enter a negative value): ");
		getHeight();
	}

	////We get user input for kilograms and meters for the metric system of units
	private void readMetricData()

	{
		System.out.print("Please input your weight in kilograms (do not enter a negative value): ");
		getWeight();
		System.out.print("Please input your height in meters (do not enter a negative value): ");
		getHeight();
	}

	//We will use this method and return the BMI to the method calculateBmiCategory
	public void calculateBmi()

	{
		if (option == Metric)
		{ 
			BMI = weight / (height * height); 
		} 
		else if (option == Standard) 
		{ 
			BMI = 703 * weight / (height * height); 
		}
		
		calculateBmiCategory();
	}

	//This method is used to calculate your BMI category based off of your BMI score
	private void calculateBmiCategory()

	{
		if (BMI < 18.5)
		{
			BMICategory = "Underweight";
		}
		else if (BMI > 18.5 && BMI < 24.9)
		{
			BMICategory = "Normal Weight";
		}
		else if (BMI > 24.9 && BMI < 29.9)
		{
			BMICategory = "Overweight";
		}
		else
		{
			BMICategory = "Obese";
		}
	}
	
	//This method is just for us to print out a message along with the user's calculated BMI score
	public void getBmi()

	{
		System.out.printf("\nAfter performing your necessary calculations, your BMI is approximately %.2f\n", BMI);
	}

	//This method is just for us to print out a message along with the user's calculated BMI category
	public void getBmiCategory()

	{
		System.out.println("Based off of your BMI value your category is listed as : " + BMICategory);
	}

	//This method is to call both getBmi and getBmiCategory for use in the main 
	public void displayBmi()

	{
		getBmi();
		getBmiCategory();
	}
	
	//The get method returns the weight variable value
	public void getWeight()

	{

		double weightinput;
		weightinput = userInput.nextDouble();
		if (weightinput < 0) 
		{
			System.out.println("You can't have a negative weight... please rerun the program.");
			System.exit(0);
		}

		setWeight(weightinput);
	}
	
	//The get method returns the height variable value
	public void getHeight()

	{

		double heightinput;
		heightinput = userInput.nextDouble();
		if (heightinput < 0) 
		{
			System.out.println("You can't have a negative height... please rerun the program.");
			System.exit(0);
		}

		setHeight(heightinput);
	}

	//The set method assigns the value to weight
	private void setWeight(double weightinput)

	{
		weight = weightinput;
	}

	////The set method assigns the value to height
	private void setHeight(double heightinput)

	{
		height = heightinput;
	}

}