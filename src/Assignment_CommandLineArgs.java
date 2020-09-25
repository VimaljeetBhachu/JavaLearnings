import java.util.Scanner;
public class Assignment_CommandLineArgs {
	
	public static void addingNumbers(double numOne,double numTwo,double numThree) {
		double numTotal = numOne + numTwo + numThree;
		System.out.println("Sum: " + numTotal);
	}
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			double firstNumber;
			double secondNumber;
			double thirdNumber;
			System.out.println("Enter 3 numbers: ");
			firstNumber = scan.nextDouble();
			secondNumber = scan.nextDouble();
			thirdNumber = scan.nextDouble();
			Assignment_CommandLineArgs obj = new Assignment_CommandLineArgs();
			obj.addingNumbers(firstNumber, secondNumber, thirdNumber);
		} catch(Exception e) {
			System.out.println("ERROR: " + e);
			System.out.println("The program execution finished with an ERROR");
		}
	}
}
