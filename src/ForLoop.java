public class ForLoop {

	public static void main(String[] args) {
		
		System.out.println(isPrime(9));
//		for(int i = 0; i < 5; i++) {
//			System.out.println("Loop " + i + " hello!");
//		}
	}
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
