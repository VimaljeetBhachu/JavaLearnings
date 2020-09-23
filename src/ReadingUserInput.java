import java.util.Scanner;
public class ReadingUserInput {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your year of birth: ");
		boolean hasNextInt = scanner.hasNextInt();
		if(hasNextInt) {
			
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine();      // must be used after taking number user input
			int age = 2020 - yearOfBirth;
			
			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			if(age >= 0 && age <=100) {
				System.out.println("Your name is " + name + " and you are " + age + " years old");
			} else {
				System.out.println("Invalid year of birth");
			}
		}else {
			System.out.println("Unable to parse year of birth");
		}
		
		
		scanner.close();
	}

}
