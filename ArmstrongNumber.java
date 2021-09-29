package javaProgram;

import org.testng.annotations.Test;

public class ArmstrongNumber {
	int n = 153;

	@Test(priority = 1)
	public void arm1() {
		int calculated = 0, reminder, original;
		original = n;
		while (n > 0) {
			reminder = n % 10;
			n = n / 10;
			calculated = calculated + (reminder * reminder * reminder);

		}
		if (original == calculated)
			System.out.println("The given number is Armstrong Number");

		else
			System.out.println("The given number is  not Armstrong Number");

	}

}
