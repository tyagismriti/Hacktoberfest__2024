// Calculate the Sum of First N Odd & Even Numbers in Java
import java.io.*;

public class GFG {

	// Driver function
	public static void main(String[] args)
	{
		int n = 8;
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 1; i <= 2 * n; i++) {
			// check even & odd using Bitwise AND operator
			if ((i & 1) == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		// Sum of even numbers less than 17
		System.out.println("Sum of First " + n
						+ " Even numbers = " + evenSum);

		// sum of odd numbers less than 17
		System.out.println("Sum of First " + n
						+ " Odd numbers = " + oddSum);
	}
}
