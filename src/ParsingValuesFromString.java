
public class ParsingValuesFromString {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = " + numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		int anotherNumber = 2;
		int numberTotal = number + anotherNumber;
		System.out.println(numberTotal);
	}

}
