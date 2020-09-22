
public class casting {

	public static void main(String[] args) {
		
		int myMinIntValue = -2147483648;
		byte myMinByteValue = -128;
		short myMinShortValue = -32768;
		
		int myTotal = (myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		short myNewShortValue = (short) (myMinShortValue / 2);

	}

}
