import java.util.Scanner;
public class Arrays {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//		int[] myIntValue = new int[25];
//		//myIntValue[5] = 50;
//		//double[] myDoubleArray = new double[10];
//		
//		for(int i=0;i<myIntValue.length;i++) {
//			myIntValue[i] = i*10;
//		}
//		printArray(myIntValue);
		int[] myIntegers = getIntegers(5);
		for(int i=0;i<myIntegers.length;i++) {
			System.out.println("Element " + i + ", value is " + myIntegers[i]);
		}
		
	}
	
	public static int[] getIntegers(int numbers) {
		System.out.println("Enter " + numbers + "integer values.\r");
		int[] values = new int[numbers];
		double sum = 0;
		
		for(int i=0;i<values.length;i++) {
			values[i] = scanner.nextInt();
			sum += values[i];
		}
		System.out.println("Do you want me to print sum. \n (true/false)");
		boolean option = scanner.nextBoolean();
		if(option) {
			System.out.println("Sum : " + sum);
		} else {
			System.out.println("Thank You");
		}
		return values;
	}
// public static void printArray(int[] array) {
//	 for(int i=0;i<array.length;i++) {
//			System.out.println("Element " + i + ", value is " + array[i]);
//		}
// }
}
